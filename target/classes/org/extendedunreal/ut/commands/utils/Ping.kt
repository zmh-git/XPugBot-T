package org.extendedunreal.ut.commands.utils

import org.extendedunreal.ut.Settings
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent
import org.extendedunreal.ut.commands.Command


class Ping : Command("${Settings.PREFIX}ping") {
    override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("Pong :ping_pong:").queue()
    }
}