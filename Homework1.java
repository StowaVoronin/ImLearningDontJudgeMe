{
  "id": "d479dd37-37b8-4b3c-8779-67022d11d55e",
  "version": "2.0",
  "name": "Homework1",
  "url": "https://www.google.com",
  "tests": [{
    "id": "e7188415-2e8d-403e-bacd-ab0b8b9650ea",
    "name": "JavaGuru Regestration",
    "commands": [{
      "id": "f9f19d08-a1fe-4588-a0e6-c6d7b633cdec",
      "comment": "",
      "command": "open",
      "target": "/search?q=javaguru&sca_esv=564661802&sxsrf=AB5stBhw7cURjH6xnpJg_GnX4Z9DIPpZQQ%3A1694515721913&source=hp&ei=CUIAZZO7NfDkxc8P_bWVqAY&iflsig=AD69kcEAAAAAZQBQGUJZgnjQ8KOcGkckQ8Lo9I6iNXsR&ved=0ahUKEwjT46z98qSBAxVwcvEDHf1aBWUQ4dUDCAk&uact=5&oq=javaguru&gs_lp=Egdnd3Mtd2l6IghqYXZhZ3VydTIEECMYJzIFEAAYgAQyCxAuGIAEGMcBGK8BMgoQABjLARiABBgKMgQQABgeMgIQJkjoHlAAWOUXcAB4AJABAJgBrwGgAZ8JqgEDMC44uAEDyAEA-AEBwgIHECMYigUYJ8ICCBAAGIAEGLEDwgILEAAYgAQYsQMYgwHCAhEQLhiABBixAxiDARjHARjRA8ICFxAuGIAEGLEDGIMBGMcBGK8BGJgFGJkFwgIMECMYigUYExiABBgnwgIPEAAYgAQYsQMYgwEYChgBwgIFEC4YgATCAhQQLhiABBixAxjHARivARiYBRiZBcICERAuGIAEGLEDGIMBGMcBGK8BwgIIEC4YywEYgATCAggQABjLARiABA&sclient=gws-wiz",
      "targets": [],
      "value": ""
    }, {
      "id": "db025d10-b465-41d2-a5f5-99b66e5835fe",
      "comment": "",
      "command": "click",
      "target": "css=.tF2Cxc > .yuRUbf .LC20lb",
      "targets": [
        ["css=.tF2Cxc > .yuRUbf .LC20lb", "css:finder"],
        ["xpath=//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3", "xpath:idRelative"],
        ["xpath=//h3", "xpath:position"],
        ["xpath=//h3[contains(.,'JAVA GURU — профессиональные ИТ курсы | javaguru.lv')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "e2185522-0834-456b-b0b9-1c1af62e5833",
      "comment": "",
      "command": "click",
      "target": "css=.single-hero-button > .pulse-button",
      "targets": [
        ["css=.single-hero-button > .pulse-button", "css:finder"],
        ["xpath=//a[contains(text(),'Зарегистрироваться')]", "xpath:link"],
        ["xpath=(//a[contains(@href, 'https://javaguru.lv/registracija/')])[3]", "xpath:href"],
        ["xpath=//div[2]/div/div/div/div[2]/div[2]/div/a", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "826b9921-d592-48ec-8bc2-0fa97c00c79c",
      "comment": "",
      "command": "click",
      "target": "name=form-name",
      "targets": [
        ["name=form-name", "name"],
        ["css=.name-input", "css:finder"],
        ["xpath=//input[@name='form-name']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div/div/input", "xpath:idRelative"],
        ["xpath=//input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "051c664b-1e54-4a6b-80a0-16f625f47b9c",
      "comment": "",
      "command": "type",
      "target": "name=form-name",
      "targets": [
        ["name=form-name", "name"],
        ["css=.name-input", "css:finder"],
        ["xpath=//input[@name='form-name']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div/div/input", "xpath:idRelative"],
        ["xpath=//input", "xpath:position"]
      ],
      "value": "aaaaa"
    }, {
      "id": "1de911ec-caef-4237-9401-1846f7bf8b7c",
      "comment": "",
      "command": "click",
      "target": "name=form-surname",
      "targets": [
        ["name=form-surname", "name"],
        ["css=.surname-input", "css:finder"],
        ["xpath=//input[@name='form-surname']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[2]/div/input", "xpath:idRelative"],
        ["xpath=//div[2]/div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "977c7ce3-ab5f-494a-ac7e-e958a411066f",
      "comment": "",
      "command": "type",
      "target": "name=form-surname",
      "targets": [
        ["name=form-surname", "name"],
        ["css=.surname-input", "css:finder"],
        ["xpath=//input[@name='form-surname']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[2]/div/input", "xpath:idRelative"],
        ["xpath=//div[2]/div/input", "xpath:position"]
      ],
      "value": "bbbbb"
    }, {
      "id": "48524dbf-745e-482f-81aa-75921eb4fcde",
      "comment": "",
      "command": "click",
      "target": "name=form-email",
      "targets": [
        ["name=form-email", "name"],
        ["css=.email-input", "css:finder"],
        ["xpath=//input[@name='form-email']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[3]/div/input", "xpath:idRelative"],
        ["xpath=//div[3]/div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "a394bd3a-aa12-4858-b233-447f7e736065",
      "comment": "",
      "command": "type",
      "target": "name=form-email",
      "targets": [
        ["name=form-email", "name"],
        ["css=.email-input", "css:finder"],
        ["xpath=//input[@name='form-email']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[3]/div/input", "xpath:idRelative"],
        ["xpath=//div[3]/div/input", "xpath:position"]
      ],
      "value": "sssss"
    }, {
      "id": "772ec896-fd1a-4e94-b6f9-dba261c572b4",
      "comment": "",
      "command": "click",
      "target": "name=form-phone",
      "targets": [
        ["name=form-phone", "name"],
        ["css=.phone-input", "css:finder"],
        ["xpath=//input[@name='form-phone']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[4]/div[2]/div/input", "xpath:idRelative"],
        ["xpath=//div[4]/div[2]/div/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "a74c4dc4-ff57-415e-991d-b30d5b65227d",
      "comment": "",
      "command": "type",
      "target": "name=form-phone",
      "targets": [
        ["name=form-phone", "name"],
        ["css=.phone-input", "css:finder"],
        ["xpath=//input[@name='form-phone']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[4]/div[2]/div/input", "xpath:idRelative"],
        ["xpath=//div[4]/div[2]/div/input", "xpath:position"]
      ],
      "value": "00000"
    }, {
      "id": "0f4ecb16-6b59-4205-b7a5-5286a5c83476",
      "comment": "",
      "command": "click",
      "target": "css=.selectric-course-input .label",
      "targets": [
        ["css=.selectric-course-input .label", "css:finder"],
        ["xpath=//form[@id='registration-form']/div[5]/div/div/div[2]/span", "xpath:idRelative"],
        ["xpath=//div[2]/span", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "b23edc65-2b57-4e2f-a1cf-dd531ab82915",
      "comment": "",
      "command": "click",
      "target": "css=.selectric-scroll li:nth-child(7)",
      "targets": [
        ["css=.selectric-scroll li:nth-child(7)", "css:finder"],
        ["xpath=//form[@id='registration-form']/div[5]/div/div/div[3]/div/ul/li[7]", "xpath:idRelative"],
        ["xpath=//div[3]/div/ul/li[7]", "xpath:position"],
        ["xpath=//li[contains(.,'Курс QA 3.0.')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "f6118129-0aa7-4e6b-9e1a-f0328a50fd00",
      "comment": "",
      "command": "click",
      "target": "name=form-message",
      "targets": [
        ["name=form-message", "name"],
        ["css=.message-input", "css:finder"],
        ["xpath=//textarea[@name='form-message']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[7]/textarea", "xpath:idRelative"],
        ["xpath=//textarea", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "450ac5a7-01d9-45fa-bb15-5a014f86293e",
      "comment": "",
      "command": "type",
      "target": "name=form-message",
      "targets": [
        ["name=form-message", "name"],
        ["css=.message-input", "css:finder"],
        ["xpath=//textarea[@name='form-message']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[7]/textarea", "xpath:idRelative"],
        ["xpath=//textarea", "xpath:position"]
      ],
      "value": "text"
    }, {
      "id": "0c637bd7-0efd-4252-b15f-03349c618583",
      "comment": "",
      "command": "click",
      "target": "css=.privacy-input img",
      "targets": [
        ["css=.privacy-input img", "css:finder"],
        ["xpath=//img[@alt='check']", "xpath:img"],
        ["xpath=//form[@id='registration-form']/div[8]/div/label/div/div/div/img", "xpath:idRelative"],
        ["xpath=//label/div/div/div/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "0f1c3de2-47f9-47d8-af1b-d0606f9e05a7",
      "comment": "",
      "command": "click",
      "target": "css=.checkbox-single:nth-child(2) img",
      "targets": [
        ["css=.checkbox-single:nth-child(2) img", "css:finder"],
        ["xpath=(//img[@alt='check'])[2]", "xpath:img"],
        ["xpath=//form[@id='registration-form']/div[8]/div[2]/label/div/div/div/img", "xpath:idRelative"],
        ["xpath=//div[2]/label/div/div/div/img", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "6f98a37e-dd8c-4efe-832f-8080a4a93868",
      "comment": "",
      "command": "click",
      "target": "css=.submit-button > .default-button",
      "targets": [
        ["css=.submit-button > .default-button", "css:finder"],
        ["xpath=//input[@value='Зарегистрироваться']", "xpath:attributes"],
        ["xpath=//form[@id='registration-form']/div[9]/input", "xpath:idRelative"],
        ["xpath=//div[9]/input", "xpath:position"]
      ],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "01f53d9c-a463-4a89-9705-6fd53d72ee4f",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["e7188415-2e8d-403e-bacd-ab0b8b9650ea"]
  }],
  "urls": ["https://www.google.com/"],
  "plugins": []
}