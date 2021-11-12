

## URL

### 用户信息
GET https://cloud.cn2030.com/sc/wx/HandlerSubscribe.ashx?act=User HTTP/1.1
Host:cloud.cn2030.com
Content-Type:application/json
zftsl:f07f1f8a45d2a29f0c106a42af99ea68
Accept:*/*
Connection:keep-alive
Cookie:ASP.NET_SessionId=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MzY3MDExMjUuMjk1NzU5NCwiZXhwIjoxNjM2NzA0NzI1LjI5NTc1OTQsInN1YiI6IllOVy5WSVAiLCJqdGkiOiIyMDIxMTExMjAzMTIwNSIsIlVzZXJpZCI6MTQ1MDkzNzQsIkNhdCI6MiwiS2V5IjoiMmQ2YWI0MzI2NDdlMjRlMCIsIk9wZW5pZCI6Im9xcjVvNUtnczhJbkU3aWNaeEllQ0ZscDU1dHMiLCJJc2JsYWNrIjpmYWxzZSwiVW5pb25pZCI6Im9VMjZYdDhBR3RJdlctaTNSVkttaUdXOHhNX00iLCJJcCI6IjExNC44NC4xNDYuMTM0IiwiR3VpZCI6bnVsbCwiTXhpZCI6bnVsbCwiaWdub3JlIjpmYWxzZSwieCI6MH0._zsEw84Z6lvCY6UfWvhRnnwwbl4dBMoBIZb6jLfsd54
User-Agent:Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E217 MicroMessenger/6.8.0(0x16080000) NetType/WIFI Language/en Branch/Br_trunk MiniProgramEnv/Mac
Referer:https://servicewechat.com/wx2c7f0f3c30d99445/91/page-frame.html
Accept-Language:zh-cn
Accept-Encoding:gzip, deflate, br

参数：act: User

{"status":200,"user":{"birthday":"1992-02-16","tel":"18302972634","cname":"袁婉珍","sex":2,"idcard":"610424199202167667","doctype":1}}

### 城市选择
GET https://cloud.cn2030.com/sc/wx/HandlerSubscribe.ashx?act=CustomerList&city=%5B%22%E6%B5%B7%E5%8D%97%E7%9C%81%22%2C%22%E6%98%8C%E6%B1%9F%E9%BB%8E%E6%97%8F%E8%87%AA%E6%B2%BB%E5%8E%BF%22%2C%22%22%5D&lat=31.249399185180664&lng=121.39700317382812&id=0&cityCode=469026&product=0 HTTP/1.1
Host:cloud.cn2030.com
Content-Type:application/json
zftsl:91324f5b7db5f8ec0fe147b702434df3
Accept:*/*
Connection:keep-alive
Cookie:ASP.NET_SessionId=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MzY3MDExMjUuMjk1NzU5NCwiZXhwIjoxNjM2NzA0NzI1LjI5NTc1OTQsInN1YiI6IllOVy5WSVAiLCJqdGkiOiIyMDIxMTExMjAzMTIwNSIsIlVzZXJpZCI6MTQ1MDkzNzQsIkNhdCI6MiwiS2V5IjoiMmQ2YWI0MzI2NDdlMjRlMCIsIk9wZW5pZCI6Im9xcjVvNUtnczhJbkU3aWNaeEllQ0ZscDU1dHMiLCJJc2JsYWNrIjpmYWxzZSwiVW5pb25pZCI6Im9VMjZYdDhBR3RJdlctaTNSVkttaUdXOHhNX00iLCJJcCI6IjExNC44NC4xNDYuMTM0IiwiR3VpZCI6bnVsbCwiTXhpZCI6bnVsbCwiaWdub3JlIjpmYWxzZSwieCI6MH0._zsEw84Z6lvCY6UfWvhRnnwwbl4dBMoBIZb6jLfsd54
User-Agent:Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E217 MicroMessenger/6.8.0(0x16080000) NetType/WIFI Language/en Branch/Br_trunk MiniProgramEnv/Mac
Referer:https://servicewechat.com/wx2c7f0f3c30d99445/91/page-frame.html
Accept-Language:zh-cn
Accept-Encoding:gzip, deflate, br

### 选择接种时间
GET https://cloud.cn2030.com/sc/wx/HandlerSubscribe.ashx?act=GetCustSubscribeDateAll&pid=2&id=4135&month=202111 HTTP/1.1
Host: cloud.cn2030.com
Content-Type: application/json
zftsl: c2f69548d768c011225711957a9d9a08
Accept: */*
Connection: keep-alive
Cookie: ASP.NET_SessionId=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MzY3MDQyMzkuMzMwNjI0OCwiZXhwIjoxNjM2NzA3ODM5LjMzMDYyNDgsInN1YiI6IllOVy5WSVAiLCJqdGkiOiIyMDIxMTExMjA0MDM1OSIsIlVzZXJpZCI6MTQ1MDkzNzQsIkNhdCI6MiwiS2V5IjoiNDYzMmE0ZDUxY2M1NGQ1MSIsIk9wZW5pZCI6Im9xcjVvNUtnczhJbkU3aWNaeEllQ0ZscDU1dHMiLCJJc2JsYWNrIjpmYWxzZSwiVW5pb25pZCI6Im9VMjZYdDhBR3RJdlctaTNSVkttaUdXOHhNX00iLCJJcCI6IjExNC44NC4xNDYuMTM0IiwiR3VpZCI6bnVsbCwiTXhpZCI6bnVsbCwiaWdub3JlIjpmYWxzZSwieCI6MH0.KrZGs0YiohkYsRQJ_Q3x2ReEmRSvcU6zDYnZasg1YTA
User-Agent: Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E217 MicroMessenger/6.8.0(0x16080000) NetType/WIFI Language/en Branch/Br_trunk MiniProgramEnv/Mac
Referer: https://servicewechat.com/wx2c7f0f3c30d99445/91/page-frame.html
Accept-Language: zh-cn
Accept-Encoding: gzip, deflate, br

参数：
act=GetCustSubscribeDateAll
pid=2
id=4135
month=202111

### 