public class VersionControl {

   public int firstBadVersion;

    public VersionControl(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    public boolean isBadVersion(int version){
        return version >= firstBadVersion;
    }
}
