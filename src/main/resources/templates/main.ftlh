<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bootstrap testing</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <style>
        div.container6 {
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            align-items: center;
            justify-content: center;
            display: flex;
        }
        .empty{
            wight: 50px;
            height: 100px;
        }
        button.btn-primary {
            margin-bottom: 20px;
        }
        table {
            margin-top: 20px;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<script src="../static/js/DarkChanger.js"></script>
<div class="container container6">
    <div class="row">
        <div class="empty"></div>
        <table>
            <thead>
            <tr>
                <th>ФИО</th>
                <th>Возраст</th>
                <th>Серия и номер паспорта</th>
                <th>Гражданство</th>
                <th>Адрес проживания</th>
                <th>Индекс</th>
                <th>Действия</th>
            </tr>
            </thead>
            <tbody>
            <#list humans as human>
                <tr>
                    <td>${human.getName()} ${human.getMiddle_name()} ${human.getLast_name()}</td>
                    <td>${human.getAge()}</td>
                    <td>${human.getPassport_series_and_number()}</td>
                    <td>${human.getCitizen().getCitizenship()}</td>
                    <td>${human.getCountry().getAddress()}</td>
                    <td>${human.getCountry().getIndex()}</td>
                    <td>
                        <form method="POST" action="/deleteHuman/${human.getId()}" style="display: inline;">
                            <input type="hidden" name="id" value="${human.getId()}">
                            <button type="submit" class="btn btn-danger">Удалить</button>
                        </form>
                        <a href="/editHuman/${human.getId()}" class="btn btn-primary">Редактировать</a>
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
        <form method="GET" action="/search" class="mb-3">
            <div class="mb-3">
                <label for="citizenship" class="form-label">Гражданство</label>
                <input type="text" class="form-control" id="citizenship" name="citizenship">
            </div>
            <div class="mb-3">
                <label for="index" class="form-label">Индекс</label>
                <input type="text" class="form-control" id="index" name="index">
            </div>
            <button type="submit" class="btn btn-primary">Найти людей</button>
        </form>
        <a href="/newHuman" class="btn btn-primary">Добавить нового пользователя</a>
    </div>
</div>
</body>
</html>

