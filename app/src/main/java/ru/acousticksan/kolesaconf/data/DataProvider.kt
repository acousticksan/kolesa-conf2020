package ru.acousticksan.kolesaconf.data

import ru.acousticksan.kolesaconf.R

object DataProvider {
    val directionList = listOf(
        Direction(
            name = "Android",
            image = R.drawable.direction_android,
            directionType = DirectionType.ANDROID
        ),
        Direction(
            name = "iOS",
            image = R.drawable.direction_ios,
            directionType = DirectionType.IOS
        ),
        Direction(
            name = "Management",
            image = R.drawable.direction_management,
            directionType = DirectionType.MANAGEMENT
        ),
        Direction(
            name = "Web",
            image = R.drawable.direction_web,
            directionType = DirectionType.WEB
        ),
        Direction(
            name = "Data Science",
            image = R.drawable.direction_data_science,
            directionType = DirectionType.DATA_SCIENCE
        )
    )

    val speakerList = listOf(
        Speaker(
            id = 1,
            avatar = R.drawable.speaker_1,
            name = "Ильяс Касым",
            info = "Android-разработчик в Kolesa Group",
            theme = "Новичок в продукте, которым пользуется половина страны",
            description = "Поделюсь своим опытом: как не потеряться в коде из 2 млн строчек и стать частью команды. Расскажу, почему первые месяцы работы в новой команде важнее всего.",
            time = "10:10 - 10:50",
            directionType = DirectionType.ANDROID,
            fromKolesa = true
        ),
        Speaker(
            id = 2,
            avatar = R.drawable.speaker_2,
            name = "Виктор Яковлев",
            info = "Android-разработчик в Kazdream Technologies",
            theme = "Декларативный UI. Новый стандарт разработки или путь в никуда?",
            description = "Расскажу о том, как сейчас обстоят дела с построением UI в Android. Как мы переходили от XML к Anko, а в последствии пересели на Jetpack Compose. И почему Google делает ставку именно на него.",
            time = "10:50 - 11:30",
            directionType = DirectionType.ANDROID,
            fromKolesa = false
        ),
        Speaker(
            id = 3,
            avatar = R.drawable.speaker_3,
            name = "Шернияз Кусбеков",
            info = "Тестировщик в Kolesa Group",
            theme = "Готовим кофейные UI-тесты в Android",
            description = "Расскажу, как начать и зачем писать UI тесты. Затрону темы выбора фреймворка и паттернов, используемых при написании UI-тестов.",
            time = "11:30 - 12:10",
            directionType = DirectionType.ANDROID,
            fromKolesa = true
        ),
        Speaker(
            id = 4,
            avatar = R.drawable.speaker_4,
            name = "Алексей Орехов",
            info = "Android-разработчик в Beeline Казахстан",
            theme = "Dynamic feature и все-все-все",
            description = "Расскажем, зачем нужно подключать dynamic features, где тестировать, стоит ли подключать и на сколько граблей придется наступить прежде, чем получится собрать проект.",
            time = "12:10 - 12:50",
            directionType = DirectionType.ANDROID,
            fromKolesa = false
        ),
        Speaker(
            id = 5,
            avatar = R.drawable.speaker_5,
            name = "Жалгас Бакин",
            info = "Android-разработчик в Альфа Банке",
            theme = "Борьба за независимость в многомодульных приложениях",
            description = "Что нам стоит монолит перестроить. Расскажу, как мы его распилили сначала по слоям, а затем по модулям. С какими проблемами столкнулись и как их решали.",
            time = "13:05 - 13:45",
            directionType = DirectionType.ANDROID,
            fromKolesa = false
        ),
        Speaker(
            id = 6,
            avatar = R.drawable.speaker_6,
            name = "Алихан Бакытбек",
            info = "Android-разработчик в Kolesa Group",
            theme = "Нехватка ресурсов: Подкапотная памяти",
            description = "Поговорим про память в JVM, алгоритмы сборки мусора, типы сборщиков мусора, а также про особенности в Dalvik и ART.",
            time = "13:45 - 14:25",
            directionType = DirectionType.ANDROID,
            fromKolesa = true
        ),
        Speaker(
            id = 7,
            avatar = R.drawable.speaker_7,
            name = "Кирилл Розов",
            info = "Mobile Lead в Replika.ai и автор канала Android Broadcast",
            theme = "Увлекательная жизнь в панели уведомлений",
            description = "Системные уведомления позволяют пользователям получать информацию, не заходя в приложение, и быстрее с ним взаимодействовать.\nКак использовать все возможности системы уведомлений? Как сделать уведомления в каждой версии ОС и использовать их возможности по максимуму? NotificationCompat не решит все за вас. Обо всем этом поговорим в докладе. ",
            time = "14:25 - 15:10",
            directionType = DirectionType.ANDROID,
            fromKolesa = false
        ),
        Speaker(
            id = 8,
            avatar = R.drawable.speaker_8,
            name = "Мариям Сисенгали",
            info = "Android-разработчик в Kolesa Group",
            theme = "БДСМ: базы данных и споры мобильщиков",
            description = "В этом докладе мы рассмотрим положительные и отрицательные стороны различных способов сохранения данных.",
            time = "15:10 - 15:50",
            directionType = DirectionType.ANDROID,
            fromKolesa = true
        ),
        Speaker(
            id = 9,
            avatar = R.drawable.speaker_9,
            name = "Ерасыл Майханов",
            info = "Flutter TeamLead, UCO",
            theme = "Flutter — будущее мобильной разработки?",
            description = "Расскажу об опыте создания приложения на Flutter, тонкостях и нюансах, а также когда и почему вы должны изучать Flutter.",
            time = "10:10 - 10:50",
            directionType = DirectionType.IOS,
            fromKolesa = false
        ),
        Speaker(
            id = 10,
            avatar = R.drawable.speaker_10,
            name = "Роберт Ким",
            info = "Студент BA Electrical Engineering, KAIST",
            theme = "Электрические поля, роботизированная рука и WWDC",
            description = "Расскажу, как я два раза выиграл WWDC Scholarship, какие технологии использовал, где искал вдохновение и как сочетал физику, роботехнику и Swift.",
            time = "10:50 - 11:30",
            directionType = DirectionType.IOS,
            fromKolesa = false
        ),
        Speaker(
            id = 11,
            avatar = R.drawable.speaker_11,
            name = "Баглан Дарибаев",
            info = "iOS-разработчик в Strong Team",
            theme = "Магия Firebase Remote Config",
            description = "Удаленный контроль feature flags и о том, как наша команда использовала Remote Config для раската нового дизайна.",
            time = "11:30 - 12:10",
            directionType = DirectionType.IOS,
            fromKolesa = false
        ),
        Speaker(
            id = 12,
            avatar = R.drawable.speaker_12,
            name = "Константин Строев",
            info = "iOS-разработчик в Kolesa Group",
            theme = "Писать код != Доставлять ценность",
            description = "Как сделать так, чтоб менеджеры ставили понятные задачи, дизайнеры рисовали реализуемые интерфейсы, а тестировщики проверяли задачи быстрее? Об этом и другом поговорим на докладе.",
            time = "12:10 - 12:50",
            directionType = DirectionType.IOS,
            fromKolesa = true
        ),
        Speaker(
            id = 13,
            avatar = R.drawable.speaker_13,
            name = "Асылхан Туран",
            info = "iOS-разработчик в Strong Team",
            theme = "Как готовить с Generics",
            description = "Все еще дублируете код или используете слишком много наследования? Тогда вам сюда. Поговорим о пользе и вреде использования Swift Generics на реальных примерах.",
            time = "13:05 - 13:45",
            directionType = DirectionType.IOS,
            fromKolesa = false
        ),
        Speaker(
            id = 14,
            avatar = R.drawable.speaker_14,
            name = "Игорь Плотников",
            info = "Тестировщик в Kolesa Group",
            theme = "XCUITest. Таков путь!",
            description = "Автоматизация тестирования нативных iOS-приложений с помощью фреймворка XCUITest. Рассказ о становлении и развитии наших UI тестов.",
            time = "13:45 - 14:25",
            directionType = DirectionType.IOS,
            fromKolesa = true
        ),
        Speaker(
            id = 15,
            avatar = R.drawable.speaker_15,
            name = "Данис Тазетдинов",
            info = "Chief software engineer в EPAM",
            theme = "App Clips, виджеты и все остальные: как быть ближе к пользователю в современном мире",
            description = "Десятки приложений на телефоне соревнуются за внимание пользователей. С выходом iOS 14 найти приложение в устройстве может стать еще сложнее. С появлением App Clips и новых виджетов, мы сможем привлечь новых пользователей и удерживать внимание существующих. Давайте обсудим, как лучше всего использовать эти технологии, чтобы ваше приложение не потерялось в глубине библиотеки приложений.",
            time = "14:25 - 15:10",
            directionType = DirectionType.IOS,
            fromKolesa = false
        ),
        Speaker(
            id = 16,
            avatar = R.drawable.speaker_16,
            name = "Тимур Табынбаев",
            info = "iOS TechLead в Kolesa Group",
            theme = "Как стать сеньором?",
            description = "Все ошибаются насчёт развития. Расскажу, что на самом деле нужно, чтобы стать сеньор разработчиком.",
            time = "15:10 - 15:50",
            directionType = DirectionType.IOS,
            fromKolesa = true
        ),
    )
}