package com.example.whatsappcomposeui.data

data class TabData(
    val tabName: String,
    val unReadCount: Int? = null
)

val tabList = listOf(TabData(Tabs.CHATS.value), TabData(Tabs.STATUS.value), TabData(Tabs.CALLS.value,0))

enum class Tabs(val value:String){
    CHATS("Chats"), STATUS("Status"), CALLS("Calls")
}