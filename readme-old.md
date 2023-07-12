
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


