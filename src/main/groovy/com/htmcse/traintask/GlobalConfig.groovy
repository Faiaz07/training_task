package com.htmcse.traintask

class GlobalConfig {
    public static final def USER_TYPE =[
            ADMINISTRATOR: "ADMINISTRATOR",
            REGULAR_MEMBER : "REGULAR_MEMEBER",
    ]

    public static Integer itemsPerPage() {
        return 5
    }
}
