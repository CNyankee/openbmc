require core-image-sato-sdk.bb
require conf/distro/include/ptest-packagelists.inc

IMAGE_INSTALL += "${PTESTS_FAST}"

DESCRIPTION += "Also includes ptest packages with fast execution times to allow for more automated QA."

# This image is sufficiently large (~1.8GB) that it can't actually fit in a live
# image (which has a 4GB limit), so nullify the overhead factor (1.3x out of the
# box) and explicitly add just 1500MB.
# strace-ptest in particular needs more than 500MB
IMAGE_OVERHEAD_FACTOR = "1.0"
IMAGE_ROOTFS_EXTRA_SPACE = "1524288"

# ptests need more memory than standard to avoid the OOM killer
QB_MEM = "-m 1024"
