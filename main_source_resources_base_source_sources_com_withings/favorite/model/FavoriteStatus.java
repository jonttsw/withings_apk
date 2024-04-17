package com.withings.favorite.model;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import qk.a;
import qk.yd;
import qk.zd;
/* compiled from: FavoriteStatus.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \n2\u00020\u0001:\u0003\u000b\n\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/withings/favorite/model/FavoriteStatus;", "", "Lqk/a;", "getIcon", "()Lqk/a;", RemoteMessageConst.Notification.ICON, "", "getToastLabel", "()I", "toastLabel", "Companion", "Checked", "Unchecked", "Lcom/withings/favorite/model/FavoriteStatus$Checked;", "Lcom/withings/favorite/model/FavoriteStatus$Unchecked;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface FavoriteStatus {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: FavoriteStatus.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/withings/favorite/model/FavoriteStatus$Checked;", "Lcom/withings/favorite/model/FavoriteStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lqk/a;", RemoteMessageConst.Notification.ICON, "Lqk/a;", "getIcon", "()Lqk/a;", "toastLabel", "I", "getToastLabel", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Checked implements FavoriteStatus {
        public static final Checked INSTANCE = new Checked();
        private static final a icon = zd.f93234a;
        private static final int toastLabel = C1987R.string.bookmark_toastUnsaved;

        private Checked() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Checked)) {
                return false;
            }
            Checked checked = (Checked) obj;
            return true;
        }

        @Override // com.withings.favorite.model.FavoriteStatus
        public a getIcon() {
            return icon;
        }

        @Override // com.withings.favorite.model.FavoriteStatus
        public int getToastLabel() {
            return toastLabel;
        }

        public int hashCode() {
            return 270241748;
        }

        public String toString() {
            return "Checked";
        }
    }

    /* compiled from: FavoriteStatus.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/favorite/model/FavoriteStatus$Companion;", "", "()V", "map", "Lcom/withings/favorite/model/FavoriteStatus;", "state", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FavoriteStatus map(boolean z5) {
            if (z5) {
                return Checked.INSTANCE;
            }
            return Unchecked.INSTANCE;
        }
    }

    /* compiled from: FavoriteStatus.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/withings/favorite/model/FavoriteStatus$Unchecked;", "Lcom/withings/favorite/model/FavoriteStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lqk/a;", RemoteMessageConst.Notification.ICON, "Lqk/a;", "getIcon", "()Lqk/a;", "toastLabel", "I", "getToastLabel", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Unchecked implements FavoriteStatus {
        public static final Unchecked INSTANCE = new Unchecked();
        private static final a icon = yd.f93219a;
        private static final int toastLabel = C1987R.string.bookmark_toastSaved;

        private Unchecked() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unchecked)) {
                return false;
            }
            Unchecked unchecked = (Unchecked) obj;
            return true;
        }

        @Override // com.withings.favorite.model.FavoriteStatus
        public a getIcon() {
            return icon;
        }

        @Override // com.withings.favorite.model.FavoriteStatus
        public int getToastLabel() {
            return toastLabel;
        }

        public int hashCode() {
            return -235652133;
        }

        public String toString() {
            return "Unchecked";
        }
    }

    a getIcon();

    int getToastLabel();
}
