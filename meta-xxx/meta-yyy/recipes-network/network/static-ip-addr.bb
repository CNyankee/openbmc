SUMMARY = "Enforce static IP addresses"
DESCRIPTION = "Set a priority on MAC addresses to run with: \
               factory-specified > u-boot-specified > random"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PV = "1.0"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${INTELBASE}/COPYING.apache-2.0;md5=34400b68072d710fecd0a2940a0d1658"


SRC_URI = "\
    file://00-bmc-eth1.network \
    file://00-bmc-eth0.network \
    \
    "

do_install() {
    install -m 0755 -d ${D}${sysconfdir}/systemd/network
    install -m 0755 ${WORKDIR}/00-bmc-eth0.network ${D}${sysconfdir}/systemd/network
    install -m 0755 ${WORKDIR}/00-bmc-eth1.network ${D}${sysconfdir}/systemd/network
    #install -m 0755 ${WORKDIR}/00-bmc-sit0.network ${D}${sysconfdir}/systemd/network
}
