package agendomat.generator

import agendomat.Agenda
import agendomat.Session
import agendomat.Break

class AgendaGenerator {
	
    def generateHtml(Agenda agenda) '''
<!DOCTYPE html>
<html lang="sr">
<head>
  <meta charset="UTF-8"/>
  <title>«agenda.agendaName»</title>
  <style>
    * { box-sizing: border-box; margin: 0; padding: 0; }
    body { font-family: 'Segoe UI', Arial, sans-serif; background: #f0f2f5; color: #222; }
    .header { background: #1a237e; color: white; padding: 32px 40px; }
    .header h1 { font-size: 2em; margin-bottom: 6px; }
    .header p { opacity: 0.85; font-size: 1em; }
    .container { max-width: 1100px; margin: 32px auto; padding: 0 20px; }
    .event-card { background: white; border-radius: 10px; box-shadow: 0 2px 8px rgba(0,0,0,0.10); margin-bottom: 40px; overflow: hidden; }
    .event-header { background: #283593; color: white; padding: 20px 28px; }
    .event-header h2 { font-size: 1.4em; }
    .event-header .meta { font-size: 0.9em; opacity: 0.85; margin-top: 4px; }
    .event-body { padding: 24px 28px; }
    .desc { color: #555; margin-bottom: 18px; font-style: italic; }
    .section-title { font-size: 1em; font-weight: bold; color: #1a237e; margin: 18px 0 8px 0; text-transform: uppercase; letter-spacing: 1px; }
    table { width: 100%; border-collapse: collapse; margin-bottom: 10px; }
    th { background: #1a237e; color: white; padding: 10px 12px; text-align: left; font-size: 0.92em; }
    td { padding: 9px 12px; border-bottom: 1px solid #e8eaf6; vertical-align: top; font-size: 0.93em; }
    tr:last-child td { border-bottom: none; }
    .row-session { background: #e3f2fd; }
    .row-session:hover { background: #bbdefb; }
    .row-break { background: #fff3e0; }
    .row-break:hover { background: #ffe0b2; }
    .badge { display: inline-block; padding: 2px 8px; border-radius: 12px; font-size: 0.82em; font-weight: bold; }
    .badge-session { background: #1565c0; color: white; }
    .badge-break { background: #e65100; color: white; }
    .talk-list { list-style: none; padding: 0; }
    .talk-list li { padding: 3px 0; border-bottom: 1px solid #e0e0e0; font-size: 0.9em; }
    .talk-list li:last-child { border-bottom: none; }
    .talk-time { color: #888; font-size: 0.85em; }
    .presenter-tag { display: inline-block; background: #e8eaf6; color: #283593; border-radius: 4px; padding: 1px 7px; margin: 1px; font-size: 0.82em; }
    .persons-section { display: flex; flex-wrap: wrap; gap: 8px; margin-top: 6px; }
    .person-card { background: #f5f5f5; border: 1px solid #e0e0e0; border-radius: 8px; padding: 8px 14px; font-size: 0.88em; min-width: 160px; }
    .person-card .name { font-weight: bold; color: #1a237e; }
    .person-card .role { color: #888; font-size: 0.82em; }
    .person-card .org { color: #555; font-size: 0.82em; }
    .equipment-list { font-size: 0.85em; color: #555; }
    .equipment-tag { display: inline-block; background: #f3e5f5; color: #6a1b9a; border-radius: 4px; padding: 1px 7px; margin: 1px; font-size: 0.82em; }
    .location-tag { font-size: 0.88em; color: #333; }
    .location-room { color: #1565c0; }
    .location-break { color: #e65100; }
  </style>
</head>
<body>
  <div class="header">
    <h1>«agenda.agendaName»</h1>
    «IF agenda.agendaStartDate !== null && agenda.agendaStartDate != ''»
    <p>«agenda.agendaStartDate» — «agenda.agendaEndDate»</p>
    «ENDIF»
    «IF agenda.desc !== null && agenda.desc != ''»
    <p>«agenda.desc»</p>
    «ENDIF»
  </div>
  <div class="container">
    «FOR event : agenda.events»
    <div class="event-card">
      <div class="event-header">
        <h2>«event.eventName»</h2>
        <div class="meta">«event.eventStartDate» — «event.eventEndDate»</div>
        «IF event.desc !== null && event.desc != ''»
        <div class="meta">«event.desc»</div>
        «ENDIF»
      </div>
      <div class="event-body">

        <div class="section-title">Program</div>
        <table>
          <tr>
            <th>Vreme</th>
            <th>Tip</th>
            <th>Naziv</th>
            <th>Lokacija</th>
            <th>Detalji</th>
          </tr>
          «FOR item : event.programItems»
          «IF item instanceof Session»
          «val s = item as Session»
          <tr class="row-session">
            <td>«s.startTime» — «s.endTime»</td>
            <td><span class="badge badge-session">Sesija</span></td>
            <td><strong>«s.sessionName»</strong></td>
            <td><span class="location-tag location-room">«IF s.location !== null»«s.location.locationName»«ENDIF»</span></td>
            <td>
              «IF !s.talks.empty»
              <ul class="talk-list">
                «FOR t : s.talks»
                <li>
                  <span class="talk-time">«t.talkStartTime»-«t.talkEndTime»</span>
                  <strong>«t.talkName»</strong>
                  «FOR p : t.presenters»<span class="presenter-tag">«p.personName»</span>«ENDFOR»
                </li>
                «ENDFOR»
              </ul>
              «ENDIF»
              «IF !s.techSupport.empty»
              <div style="margin-top:4px;font-size:0.83em;color:#555;">
                TechSupport: «FOR p : s.techSupport»<span class="presenter-tag">«p.personName»</span>«ENDFOR»
              </div>
              «ENDIF»
              «IF !s.equipment.empty»
              <div style="margin-top:4px;">
                «FOR eq : s.equipment»<span class="equipment-tag">«eq.equipmentName»«IF eq.equipmentType !== null && eq.equipmentType != ''» (« eq.equipmentType»)«ENDIF»</span>«ENDFOR»
              </div>
              «ENDIF»
            </td>
          </tr>
          «ENDIF»
          «IF item instanceof Break»
          «val b = item as Break»
          <tr class="row-break">
            <td>«b.startTime» — «b.endTime»</td>
            <td><span class="badge badge-break">Pauza</span></td>
            <td><strong>«b.breakName»</strong></td>
            <td><span class="location-tag location-break">«IF b.location !== null»«b.location.locationName»«ENDIF»</span></td>
            <td>
              «IF !b.animators.empty»
              Animatori: «FOR p : b.animators»<span class="presenter-tag">«p.personName»</span>«ENDFOR»
              «ENDIF»
            </td>
          </tr>
          «ENDIF»
          «ENDFOR»
        </table>

        <div class="section-title">Učesnici</div>
        <div class="persons-section">
          «FOR p : event.persons»
          <div class="person-card">
            <div class="name">«p.personName»</div>
            <div class="role">«FOR r : p.roles»«r» «ENDFOR»</div>
            «IF p.organization !== null && p.organization != ''»<div class="org">«p.organization»</div>«ENDIF»
            «IF p.email !== null && p.email != ''»<div class="org">«p.email»</div>«ENDIF»
          </div>
          «ENDFOR»
        </div>

        «IF !event.locations.empty»
        <div class="section-title">Lokacije</div>
        <div class="persons-section">
          «FOR l : event.locations»
          <div class="person-card">
            <div class="name">«l.locationName»</div>
            <div class="role">«l.locationType»</div>
          </div>
          «ENDFOR»
        </div>
        «ENDIF»

      </div>
    </div>
    «ENDFOR»
  </div>
</body>
</html>
    '''
}