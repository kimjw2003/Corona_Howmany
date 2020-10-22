package com.example.corona_howmany.data

data class Base(
    val response: Response?
)

data class Response(
    val header: Header?,
    val body: Body?
)

data class Header(
    val resultCode: String?,
    val resultMsg: String?
)

data class Body(
    val pageNo: String?,
    val totalCount: String?,
    val items: Items?,
    val numOfRows: String?
)


data class Items(
    val item: List<Item>?
)

data class Item(
    val defCnt: String?,
    val isolClearCnt: String?,
    val localOccCnt: String?,
    val incDec: String?,
    val updateDt: String?,
    val createDt: String?,
    val gubun: String?,
    val gubunEn: String?,
    val deathCnt: String?,
    val stdDay: String?,
    val qurRate: String?,
    val overFlowCnt: String?,
    val gubunCn: String?,
    val isolIngCnt: String?,
    val seq: String?
)



