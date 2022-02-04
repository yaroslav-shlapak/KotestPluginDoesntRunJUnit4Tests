package com.test.kotest.issue

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class KotestTest : FreeSpec({

    "addition is correct" {
        2 + 2 shouldBe 4
    }
})
