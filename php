<?php
require_once __DIR__ . '/../autoload.php';

$crypt = new Crypt();
$decrypt = new Decrypt();
?>
    <h1>Метод "Цезарь"</h1>
    <form action="index.php" method="post">
		<input type="hidden" name="requestSent" value="1">
        <lable>Введите слово для шифрования
            <input type="text" name="crypt">
        </lable>
        <lable>Введите ключ(число)
            <input type="text" name="key">
        </lable>
        <input type="submit" value="Зашифровать">
    </form>
    <hr>
    <form action="index.php" method="post">
		<input type="hidden" name="requestSent" value="1">
        <lable>Введите слово для расшифровки
            <input type="text" name="decrypt">
        </lable>
        <lable>Введите ключ(число)
            <input type="text" name="key">
        </lable>
        <input type="submit" value="Расшифровать">
    </form>

<?php

if (isset($_POST['requestSent'])) {
	if (isset($_POST['crypt']) && isset($_POST['key'])) {
    	$cryptWord = $crypt->cesarCrypt($_POST['crypt'], $_POST['key']);
    	echo '<h2>Результат:</h2>';
    	echo $cryptWord . '. Ключ шифрования ' . $_POST['key'];
	}

	if (isset($_POST['decrypt']) && isset($_POST['key'])) {
    	$decryptWord = $decrypt->cesarDecrypt($_POST['decrypt'], $_POST ['key']);
    	echo '<h2>Результат:</h2>';
    	echo $decryptWord . '. Ключ дешифрования ' . $_POST['key'];
	}
	if (!isset ($_POST ['key']) xor !isset ($_POST ['decrypt'])) {
    	echo 'Заполните окошко';
	} elseif (!isset ($_POST ['decrypt']) && !isset ($_POST ['key'])) {
    	echo 'Заполните оба поля';
	}
}
?>

<br>
<a href="/index.php">На главную</a>
