# Qr2Btc
QR Code to Bitcoin addresses

## Description
A simple java program which uses the awesome [zxing](https://github.com/zxing/zxing) library to find and transform the QR codes of bitcoin addresses in a scanned .png, and print them on the command line.

It assumes you are using the [bitaddress](https://www.bitaddress.org) form to generate the following:
1.  Paper Wallet
2.  Hide Art is checked
3.  Generate `7` QR codes (can be less)

## Build

This program uses maven. Note, none of the keys in the test files are used for anything other then testing.

`mvn clean package install`

## Usage

`./qr2code foo.png`

## License

BSD license. No warranties of any kind.

Copyright (c) 2014 Bernhard Damberger


