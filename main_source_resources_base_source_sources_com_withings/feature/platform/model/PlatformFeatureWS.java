package com.withings.feature.platform.model;

import androidx.compose.material3.d;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformFeatureWS.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/withings/feature/platform/model/PlatformFeatureWS;", "", "featureId", "", "name", "", "owners", "", "Lcom/withings/feature/platform/model/OwnerWS;", "synced", "", "(ILjava/lang/String;Ljava/util/List;Z)V", "getFeatureId", "()I", "getName", "()Ljava/lang/String;", "getOwners", "()Ljava/util/List;", "setOwners", "(Ljava/util/List;)V", "getSynced", "()Z", "setSynced", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformFeatureWS {
    @SerializedName("featureid")
    private final int featureId;
    private final String name;
    private List<? extends OwnerWS> owners;
    private boolean synced;

    public PlatformFeatureWS(int i11, String str, List<? extends OwnerWS> owners, boolean z5) {
        u.j(owners, "owners");
        this.featureId = i11;
        this.name = str;
        this.owners = owners;
        this.synced = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformFeatureWS copy$default(PlatformFeatureWS platformFeatureWS, int i11, String str, List list, boolean z5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = platformFeatureWS.featureId;
        }
        if ((i12 & 2) != 0) {
            str = platformFeatureWS.name;
        }
        if ((i12 & 4) != 0) {
            list = platformFeatureWS.owners;
        }
        if ((i12 & 8) != 0) {
            z5 = platformFeatureWS.synced;
        }
        return platformFeatureWS.copy(i11, str, list, z5);
    }

    public final int component1() {
        return this.featureId;
    }

    public final String component2() {
        return this.name;
    }

    public final List<OwnerWS> component3() {
        return this.owners;
    }

    public final boolean component4() {
        return this.synced;
    }

    public final PlatformFeatureWS copy(int i11, String str, List<? extends OwnerWS> owners, boolean z5) {
        u.j(owners, "owners");
        return new PlatformFeatureWS(i11, str, owners, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformFeatureWS)) {
            return false;
        }
        PlatformFeatureWS platformFeatureWS = (PlatformFeatureWS) obj;
        if (this.featureId == platformFeatureWS.featureId && u.e(this.name, platformFeatureWS.name) && u.e(this.owners, platformFeatureWS.owners) && this.synced == platformFeatureWS.synced) {
            return true;
        }
        return false;
    }

    public final int getFeatureId() {
        return this.featureId;
    }

    public final String getName() {
        return this.name;
    }

    public final List<OwnerWS> getOwners() {
        return this.owners;
    }

    public final boolean getSynced() {
        return this.synced;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.featureId) * 31;
        String str = this.name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.synced) + e.b(this.owners, (hashCode2 + hashCode) * 31, 31);
    }

    public final void setOwners(List<? extends OwnerWS> list) {
        u.j(list, "<set-?>");
        this.owners = list;
    }

    public final void setSynced(boolean z5) {
        this.synced = z5;
    }

    public String toString() {
        int i11 = this.featureId;
        String str = this.name;
        List<? extends OwnerWS> list = this.owners;
        boolean z5 = this.synced;
        StringBuilder a11 = d.a("PlatformFeatureWS(featureId=", i11, ", name=", str, ", owners=");
        a11.append(list);
        a11.append(", synced=");
        a11.append(z5);
        a11.append(")");
        return a11.toString();
    }
}
