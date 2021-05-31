COMPATIBLE_MACHINE = "yyy-ast2500"
FILESEXTRAPATHS_append_yyy-ast2500:= "${THISDIR}/files:"


SRC_URI_append_yyy-ast2500 = " \
    file://0001-yyy-xxx-hypercard_bringup-read_macaddr_from_eeprom.patch \
    "

