name: 错误问题反馈 Bug Report
about: 反馈遇到的问题 Feedback the encountered issues
title: ""
labels: ["Bug"]
assignees: ""

body
  - type: markdown
    attributes:
      value: |
        仅仅反馈所遇到的一个使用问题，多个请重新提交另外的 issue
        Only give feedback on one usage problem encountered, please resubmit another issue

  - type: checkboxes
    id: terms
    attributes:
      label: 在反馈此问题前请注意
      description: 在提交此反馈前请确认以下内容
      options:
        - label: 详细阅读椒盐音乐帮助内容 Read more about the Salt Player help content
          required: true
        - label: 尝试在仓库 issue 搜索你要反馈的问题，避免重复反馈 Try to search for your feedback in the warehouse issue to avoid repeated feedback
          required: true
  - type: textarea
    id: issue
    attributes:
      label: 描述问题
      description: |
        尽量详细的描述问题 Describe the problem as detailed as possible
        提供出现此问题的椒盐音乐版本号 Provide the version number of Salt Player where this issue occurred
        建议提供机型、系统版本 You are advised to provide the model and system version
      placeholder: 在此输入你遇到的问题，必填 Enter the problem you encountered here. Required
    validations:
      required: true

软件版本 Software version：<软件版本 Software version>
系统版本 System version：<系统版本 System version>