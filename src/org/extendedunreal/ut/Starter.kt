package org.extendedunreal.ut

object Starter {
    @JvmStatic
    fun main(args: Array<String>) {
        val bot = Bot(Settings.BOT_TOKEN)

        bot.start()
    }
}