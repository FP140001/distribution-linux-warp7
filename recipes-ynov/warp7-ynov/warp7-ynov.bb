LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = " \
 git://github.com/FlorianPASCAL/warp7-ynov;branch=main;protocol=https \
 file://thermo.service \
"

PV = "1.0+git${SRCPV}"
SRCREV = "e28d6523224b01acff0afb992dbb79b9a46591e1"

S = "${WORKDIR}/git"

inherit cmake systemd

do_install_append(){
 install -d ${D}${systemd_system_unitdir}/
 install -m 0644 ${WORKDIR}/thermo.service ${D}${systemd_system_unitdir}/
}

SYSTEMD_SERVICE_${PN} = "thermo.service"
SYSTEMD_AUTO_ENABLE = "enable"