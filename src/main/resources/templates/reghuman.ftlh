<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bootstrap testing</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <style>
        .invert {
            filter: invert(0);
        }
        @media (prefers-color-scheme: light) {
            .invert {
                filter: invert(1);
            }
        }

        div.container6 {
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            align-items: center;
            justify-content: center;
            display: flex;
        }

        .logo{
            width: 500px;
            height: auto;
        }
        .empty{
            wight: 50px;
            height: 100px;
        }
        button.btn-primary {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<script src="../static/js/DarkChanger.js"></script>
<div class="container container6">
    <div class="row">
        <div class="empty"></div>
        <form action="/newHuman" method="post">
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="last_name" placeholder="last_name"><br>
                <label for="floatingInput">Фамилия</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="name" placeholder="name"><br>
                <label for="floatingInput">Имя</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="middle_name" placeholder="middle_name"><br>
                <label for="floatingInput">Отчёство</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="passport_series_and_number" placeholder="passport_series_and_number"><br>
                <label for="floatingInput">Серия и номер паспорта</label>
            </div>
            <div class="form-floating mb-3">
                <input type="number" class="form-control" name="age" placeholder="age"><br>
                <label for="floatingInput">Возраст</label>
            </div>
            <div class="form-floating mb-3">
                <label for="citizen_id" style="margin-top: -15px">Гражданство</label>
                <select id="citizen_id" required name="citizen_id" class="form-control">
                    <option value="">Гражданство не выбрано</option>
                    <#if citizens?exists>
                        <#list citizens as citizen>
                            <option value=${citizen.id}>${citizen.getCitizenship()} </option>
                        </#list>
                    </#if>
                </select>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="address" placeholder="address"><br>
                <label for="floatingInput">Адресс проживания</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="index" placeholder="index"><br>
                <label for="floatingInput">Индекс</label>
            </div>
            <button type="submit" class="btn btn-primary">Сохранить</button>
        </form>
    </div>
</div>

</body>
</html>