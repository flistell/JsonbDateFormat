
## Services

- Ping: http://localhost:7001/recordrest-web/resources/ping
- DateDemoService: http://localhost:7001/recordrest-web/resources/datedemo
- RecordService: 
  - getAll: http://localhost:7001/recordrest-web/resources/record/all
  - add: POST http://localhost:7001/recordrest-web/resources/record/add
  - get: http://localhost:7001/recordrest-web/resources/record/{ID}

## DB Table DDL

```sql
  CREATE TABLE "APP_USER1"."APP_TABLE2" 
   (	"ID" VARCHAR2(20 BYTE), 
	"DATE_AS_TIMESTAMP" DATE, 
	"DATE_AS_DATE" DATE, 
	"TIMESTAMP_AS_TIMESTAMP" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
```

## DB Table content

| ID  | DATE_AS_TIMESTAMP | DATE_AS_DATE | TIMESTAMP_AS_TIMESTAMP          |
| --- | ----------------- | ------------ | ------------------------------- |
| 1   | 14-JUN-23         | 19-NOV-75    | 01-JAN-70 01.02.03.456789000 AM |
| 2   | 12-JUN-23         | 01-JAN-80    | 03-JAN-01 09.08.07.654321000 AM |


"DUMP(DATE_AS_DATE)"	"DUMP(DATE_AS_TIMESTAMP)"	"DUMP(TIMESTAMP_AS_TIMESTAMP)"
"Typ=12 Len=7: 119,175,11,19,14,58,1"	"Typ=12 Len=7: 120,123,6,14,19,56,26"	"Typ=180 Len=11: 119,170,1,1,2,3,4,27,58,12,8"
"Typ=12 Len=7: 119,180,1,1,13,13,1"	"Typ=12 Len=7: 120,123,6,12,21,48,20"	"Typ=180 Len=11: 100,101,1,3,10,9,8,39,0,37,104"


## Test cases

| DB Column Name         | Column Format | Java Type          | Annotation      | Git Tag   | Id  | Output Format               |
| ---------------------- | ------------- | ------------------ | --------------- | --------- | --- | --------------------------- |
| DATE_AS_TIMESTAMP      | DATE          | java.sql.Timestamp |                 | VERSION-1 | 1   | "2023-06-14T16:55:25Z[UTC]" |
| DATE_AS_DATE           | DATE          | java.util.Date     | @Temporal(DATE) | VERSION-1 | 1   | "1975-11-18T23:00:00Z[UTC]" |
| TIMESTAMP_AS_TIMESTAMP | TIMESTAMP     | java.sql.Timestamp |                 | VERSION-1 | 1   | "1969-12-31T23:00:00Z[UTC]" |
|                        |               |                    |                 |           |     |                             |

## Results

### tag:VERSION-2

#### JDK 8

$ curl -x '' -X POST http://localhost:7001/recordrest-web/resources/record/add

```json
{"dateAsDate":"2023-06-19T10:59:10.327Z[UTC]","dateAsTimestamp":"2023-06-19T10:59:10.327Z[UTC]","id":"1687172350327","timestampAsTimestamp":"2023-06-19T10:59:10.327Z[UTC]"}
```

$ curl -x '' -X GET http://localhost:7001/recordrest-web/resources/record/all

```json
[
   {"dateAsDate":"1975-11-19T12:57:00Z[UTC]","dateAsTimestamp":"2023-06-14T16:55:25Z[UTC]","id":"1","timestampAsTimestamp":"1970-01-01T00:02:03.456Z[UTC]"},
   {"dateAsDate":"1980-01-01T11:12:00Z[UTC]","dateAsTimestamp":"2023-06-12T18:47:19Z[UTC]","id":"2","timestampAsTimestamp":"0001-01-01T08:08:08.654Z[UTC]"},
   {"dateAsDate":"2023-06-15T22:00:00Z[UTC]","dateAsTimestamp":"2023-06-16T08:35:36Z[UTC]","id":"1686904536728","timestampAsTimestamp":"2023-06-16T08:35:36.728Z[UTC]"}
   {"dateAsDate":"2023-06-16T08:27:22Z[UTC]","dateAsTimestamp":"2023-06-16T08:27:22Z[UTC]","id":"1686904042427","timestampAsTimestamp":"1970-01-02T10:17:36.789Z[UTC]"},
   {"dateAsDate":"2023-06-16T08:30:21Z[UTC]","dateAsTimestamp":"2023-06-16T08:30:21Z[UTC]","id":"1686904221757","timestampAsTimestamp":"2023-06-16T08:30:21.757Z[UTC]"},
   {"dateAsDate":"2023-06-19T10:59:10.327Z[UTC]","dateAsTimestamp":"2023-06-19T10:59:10.327Z[UTC]","id":"1687172350327","timestampAsTimestamp":"2023-06-19T10:59:10.327Z[UTC]"},
]
```
#### JDK 11

$  curl -x '' -X POST http://localhost:7001/recordrest-web/resources/record/add

```json
{"dateAsDate":"2023-06-19T11:15:56.859Z[UTC]","dateAsTimestamp":"2023-06-19T11:15:56.859Z[UTC]","id":"1687173356859","timestampAsTimestamp":"2023-06-19T11:15:56.859Z[UTC]"}
```

$ curl -x '' -X GET http://localhost:7001/recordrest-web/resources/record/all

```json
[
  { "dateAsDate":"1975-11-19T12:57:00Z[UTC]","dateAsTimestamp":"2023-06-14T16:55:25Z[UTC]","id":"1","timestampAsTimestamp":"1970-01-01T00:02:03.456Z[UTC]"},
  { "dateAsDate":"1980-01-01T11:12:00Z[UTC]","dateAsTimestamp":"2023-06-12T18:47:19Z[UTC]","id":"2","timestampAsTimestamp":"0001-01-01T08:08:08.654Z[UTC]"},
  { "dateAsDate":"2023-06-15T22:00:00Z[UTC]","dateAsTimestamp":"2023-06-16T08:35:36Z[UTC]","id":"1686904536728","timestampAsTimestamp":"2023-06-16T08:35:36.728Z[UTC]"}
  { "dateAsDate":"2023-06-16T08:27:22Z[UTC]","dateAsTimestamp":"2023-06-16T08:27:22Z[UTC]","id":"1686904042427","timestampAsTimestamp":"1970-01-02T10:17:36.789Z[UTC]"},
  { "dateAsDate":"2023-06-16T08:30:21Z[UTC]","dateAsTimestamp":"2023-06-16T08:30:21Z[UTC]","id":"1686904221757","timestampAsTimestamp":"2023-06-16T08:30:21.757Z[UTC]"},
  { "dateAsDate":"2023-06-18T22:00:00Z[UTC]","dateAsTimestamp":"2023-06-19T10:59:10Z[UTC]","id":"1687172350327","timestampAsTimestamp": "2023-06-19T10:59:10.327Z[UTC]"},
  { "dateAsDate":"2023-06-19T11:15:56.859Z[UTC]","dateAsTimestamp":"2023-06-19T11:15:56.859Z[UTC]","id":"1687173356859","timestampAsTimestamp":"2023-06-19T11:15:56.859Z[UTC]"},
  { "dateAsDate":"2023-06-19T11:19:48.594Z[UTC]","dateAsTimestamp":"2023-06-19T11:19:48.594Z[UTC]","id":"1687173588594","timestampAsTimestamp":"2023-06-19T11:19:48.594Z[UTC]"},
]
```


## Reousrces

### WebLogic 

- [What's New in Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/notes/whatsnew.html#GUID-DF8CFD1C-9DD1-423E-ACA6-9717D5738385)
- [Developing and Securing RESTful Web Services for Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/restf/jersey-back-comp.html#GUID-3219374B-7213-4D1F-A0E9-A6113FF44EB4)
- [Developing JAX-WS Web Services for Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wsget/jax-ws-intro.html#GUID-49D730F9-1F69-43DE-980C-7A18FB5285D9)
- [Upgrading Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlupg/upgrade_ws.html#GUID-A9BF7068-B532-4A2D-96D8-6B2B9EFBFD71)
- [Java API for JSON Processing](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlprg/java-api-for-json-proc.html#GUID-53ED16E0-0669-4698-AAAB-BB0C7B9A977B)
- [Java API for JSON Binding](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlprg/java-api-json-binding.html#GUID-203F8D60-C2E9-4183-8357-00B8A289E3D9)

### Other

* [FasterXML/jackson-jaxrs-providers: Multi-module project that contains Jackson-based "old" JAX-RS (ones under \`javax.ws.rs\`) providers for JSON, XML, YAML, Smile, CBOR formats](https://github.com/FasterXML/jackson-jaxrs-providers)
* [rest - Configure Jackson as JSON Provider in JAX-RS 2.0 - Stack Overflow](https://stackoverflow.com/questions/18741954/configure-jackson-as-json-provider-in-jax-rs-2-0)
* [Using Jackson as JSON provider in Jersey 2.x | cassiomolin](https://cassiomolin.com/2016/08/10/using-jackson-as-json-provider-in-jersey-2x/)
* [JAX-RS 2.0 behavior changes - IBM Documentation](https://www.ibm.com/docs/en/was-zos/9.0.5?topic=applications-jax-rs-20-behavior-changes)
* [java - Use Jackson as JAXB-JSON-processor in JavaEE Application - Stack Overflow](https://stackoverflow.com/questions/29698350/use-jackson-as-jaxb-json-processor-in-javaee-application)
* [java - How to disable Jersey's JacksonJsonProvider auto registration so I use my own? - Stack Overflow](https://stackoverflow.com/questions/23441095/how-to-disable-jerseys-jacksonjsonprovider-auto-registration-so-i-use-my-own)


