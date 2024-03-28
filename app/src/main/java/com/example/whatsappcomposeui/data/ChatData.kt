package com.example.whatsappcomposeui.data

import com.example.whatsappcomposeui.R

data class ChatData(
    val chatId: Int,
    val messageDetails: MessageDetails,
    val userDetails: UserDetails
)

data class MessageDetails(
    val message: String,
    val timeStamp: String,
    val messageType: MessageType,
    val deliveryStatus: DeliveryStatus,
    val unreadCount: Int
    )

data class UserDetails(
    val userName: String,
    val userDp: Int
)

enum class MessageType{
    MESSAGE, LOCATION, DOCUMENT
}

enum class DeliveryStatus{
    SENT, FAILED, SEEN
}

val chatDataList = listOf(
    ChatData(
        chatId = 1,
        messageDetails = MessageDetails(
            message = "Will you be the King in the North?",
            timeStamp = "10:00 AM",
            messageType = MessageType.MESSAGE,
            deliveryStatus = DeliveryStatus.SENT,
            unreadCount = 0
        ),
        userDetails = UserDetails(
            userName = "Robb Stark",
            userDp = R.drawable.ic_launcher_foreground
        )
    ),
    ChatData(
        chatId = 2,
        messageDetails = MessageDetails(
            message = "I'm good, thanks!",
            timeStamp = "2024-01-21 ",
            messageType = MessageType.MESSAGE,
            deliveryStatus = DeliveryStatus.SEEN,
            unreadCount = 0
        ),
        userDetails = UserDetails(
            userName = "Jon Snow",
            userDp = R.drawable.img_1
        )
    ),
    ChatData(
        chatId = 3,
        messageDetails = MessageDetails(
            message = "We need to talk",
            timeStamp = "2024-03-27",
            messageType = MessageType.MESSAGE,
            deliveryStatus = DeliveryStatus.FAILED,
            unreadCount = 3
        ),
        userDetails = UserDetails(
            userName = "Margery Tyrell",
            userDp = R.drawable.ic_launcher_foreground
        )
    ),ChatData(
        chatId = 1,
        messageDetails = MessageDetails(
            message = "Thanks for the Needle :)",
            timeStamp = "Yesterday",
            messageType = MessageType.MESSAGE,
            deliveryStatus = DeliveryStatus.SENT,
            unreadCount = 2
        ),
        userDetails = UserDetails(
            userName = "Arya Stark",
            userDp = R.drawable.soldier
        )
    ),
    ChatData(
        chatId = 2,
        messageDetails = MessageDetails(
            message = "Hi",
            timeStamp = "11:00 PM",
            messageType = MessageType.MESSAGE,
            deliveryStatus = DeliveryStatus.SENT,
            unreadCount = 1
        ),
        userDetails = UserDetails(
            userName = "Khalisi",
            userDp = R.drawable.ic_launcher_foreground
        )
    ),
    ChatData(
        chatId = 3,
        messageDetails = MessageDetails(
            message = "I'm decapitated",
            timeStamp = "12:00 PM",
            messageType = MessageType.MESSAGE,
            deliveryStatus = DeliveryStatus.SENT,
            unreadCount = 2
        ),
        userDetails = UserDetails(
            userName = "Ned Stark",
            userDp = R.drawable.ned_stark
        )
    )
)
