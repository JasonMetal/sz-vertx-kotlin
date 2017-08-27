package controllers

import models.PlanTask
import sz.scaffold.annotations.Comment
import sz.scaffold.controller.ApiController
import sz.scaffold.controller.reply.ReplyBase
import tasks.SampleTask


@Comment("样例/测试")
class Sample : ApiController() {

    @Comment("KK 临时测试代码")
    fun kktest(): ReplyBase {
        val reply = ReplyBase()

        val task = SampleTask()

        PlanTask.addTask(task)

        return reply
    }
}