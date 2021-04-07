FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://usb0.network \
"
do_install_append(){
    #Install files into rootfs
    install -Dm 0644 ${WORKDIR}/usb0.network ${D}${systemd_unitdir}/network/

    #Remove file into rootfs
    rm ${D}${systemd_unitdir}/network/80-wired.network
}
