#!/bin/bash

list="$(find $1 -type f -name '*.java')"

if [ "$list" ]
then
	for i in $list
	do
		echo "Ada file Java pada direktori $i"
	done
else
	echo "Tidak ada file Java pada direktori $list"
fi
