#!/bin/sh
<<<<<<< HEAD
x=0
echo "数字を入力してください"
read inRead
if [ $inRead ] ; then
	while [ $x -ne $inRead ]
	do
		x=`expr $x + 1`
		flag=0
		message=$x
		if [ `expr $x % 3` -eq 0 ] ; then
			flag=`expr $flag + 1`
		fi
		if [ `expr $x % 5` -eq 0 ] ; then
			flag=`expr $flag + 2`
		fi
		case $flag in
		1 ) message="FIZZ" ;;
		2 ) message="BUZZ" ;;
		3 ) message="FIZZBUZZ" ;;
		* ) message="$x" ;;
		esac
		echo "${message}"
	done
else
	echo "数字を入力してって言ったじゃないか・・・"
fi
