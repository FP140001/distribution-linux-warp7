FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://fragment.cfg \
    file://0001-add-mcp23s08.patch \
    file://0002-add-lm75.patch \
    file://0001-Modif-led.patch \
"
