class InshortsApp {
    static String version;
    static String updatedOn;
    static String downloads;
    static String downloadSite;
    static String requiredOS;
    static String offeredBy;
    static String releasedOn;
    static String compatibility;

    public static boolean getPropertiesInfo(String ver, String updOn, String dlCount, String dlSite, String reqOS, String offered, String relOn, String compat) {
        boolean isPropertiesValidate = false;

        boolean isVersionValidate = false;
        boolean isUpdatedOnValidate = false;
        boolean isDownloadsValidate = false;
        boolean isDownloadSiteValidate = false;
        boolean isRequiredOSValidate = false;
        boolean isOfferedByValidate = false;
        boolean isReleasedOnValidate = false;
        boolean isCompatibilityValidate = false;

        if(ver != null && !ver.isEmpty()) {
            System.out.println("Version is validated");
            version = ver;
            isVersionValidate = true;
        } else {
            System.out.println("Version is not validated");
        }

        if(updOn != null && !updOn.isEmpty()) {
            System.out.println("Updated On is validated");
            updatedOn = updOn;
            isUpdatedOnValidate = true;
        } else {
            System.out.println("Updated On is not validated");
        }

        if(dlCount != null && !dlCount.isEmpty()) {
            System.out.println("Downloads count is validated");
            downloads = dlCount;
            isDownloadsValidate = true;
        } else {
            System.out.println("Downloads count is not validated");
        }

        if(dlSite != null && !dlSite.isEmpty()) {
            System.out.println("Download site is validated");
            downloadSite = dlSite;
            isDownloadSiteValidate = true;
        } else {
            System.out.println("Download site is not validated");
        }

        if(reqOS != null && !reqOS.isEmpty()) {
            System.out.println("Required OS is validated");
            requiredOS = reqOS;
            isRequiredOSValidate = true;
        } else {
            System.out.println("Required OS is not validated");
        }

        if(offered != null && !offered.isEmpty()) {
            System.out.println("Offered By is validated");
            offeredBy = offered;
            isOfferedByValidate = true;
        } else {
            System.out.println("Offered By is not validated");
        }

        if(relOn != null && !relOn.isEmpty()) {
            System.out.println("Released On is validated");
            releasedOn = relOn;
            isReleasedOnValidate = true;
        } else {
            System.out.println("Released On is not validated");
        }

        if(compat != null && !compat.isEmpty()) {
            System.out.println("Compatibility is validated");
            compatibility = compat;
            isCompatibilityValidate = true;
        } else {
            System.out.println("Compatibility is not validated");
        }

        if(isVersionValidate && isUpdatedOnValidate && isDownloadsValidate && isDownloadSiteValidate  && isRequiredOSValidate && isOfferedByValidate && isReleasedOnValidate && isCompatibilityValidate) {
            isPropertiesValidate = true;
        }

        return isPropertiesValidate;
    }

    public static void displayAppInfo() {
        System.out.println("Version : " + version);
        System.out.println("Updated On : " + updatedOn);
        System.out.println("Downloads : " + downloads);
        System.out.println("Download Site : " + downloadSite);
        System.out.println("Required OS : " + requiredOS);
        System.out.println("Offered By : " + offeredBy);
        System.out.println("Released On : " + releasedOn);
        System.out.println("Compatibility : " + compatibility);
    }
}