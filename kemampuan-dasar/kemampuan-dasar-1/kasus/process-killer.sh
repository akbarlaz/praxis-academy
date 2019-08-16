#!/bin/bash

if  pgrep -x "$1" > /dev/null
then
	kill $(pgrep -x "$1")
	echo "Proses berhasil dimatikan"
else
	echo "Proses tidak ditemukan atau sedang tidak aktif"
fi
