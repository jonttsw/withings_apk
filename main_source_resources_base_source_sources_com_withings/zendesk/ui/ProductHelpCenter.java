package com.withings.zendesk.ui;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import androidx.work.impl.g;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HelpCenterActivity.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b6\u00107J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011Jb\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\tJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\tJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b,\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b-\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b/\u0010\tR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b0\u0010\u0004R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u0010\rR\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b3\u0010\rR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\b5\u0010\u0011¨\u00068"}, d2 = {"Lcom/withings/zendesk/ui/ProductHelpCenter;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "component4", "()I", "component5", "", "component6", "()J", "component7", "Landroid/content/Intent;", "component8", "()Landroid/content/Intent;", "productName", "productInfo", "productUrl", "productRes", "productImageUrl", "categoryId", "sectionId", "tutorialIntent", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JJLandroid/content/Intent;)Lcom/withings/zendesk/ui/ProductHelpCenter;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getProductName", "getProductInfo", "getProductUrl", "I", "getProductRes", "getProductImageUrl", "J", "getCategoryId", "getSectionId", "Landroid/content/Intent;", "getTutorialIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JJLandroid/content/Intent;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProductHelpCenter implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProductHelpCenter> CREATOR = new Creator();
    private final long categoryId;
    private final String productImageUrl;
    private final String productInfo;
    private final String productName;
    private final int productRes;
    private final String productUrl;
    private final long sectionId;
    private final Intent tutorialIntent;

    /* compiled from: HelpCenterActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<ProductHelpCenter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductHelpCenter createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new ProductHelpCenter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong(), (Intent) parcel.readParcelable(ProductHelpCenter.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductHelpCenter[] newArray(int i11) {
            return new ProductHelpCenter[i11];
        }
    }

    public ProductHelpCenter(String productName, String productInfo, String productUrl, int i11, String productImageUrl, long j5, long j11, Intent intent) {
        u.j(productName, "productName");
        u.j(productInfo, "productInfo");
        u.j(productUrl, "productUrl");
        u.j(productImageUrl, "productImageUrl");
        this.productName = productName;
        this.productInfo = productInfo;
        this.productUrl = productUrl;
        this.productRes = i11;
        this.productImageUrl = productImageUrl;
        this.categoryId = j5;
        this.sectionId = j11;
        this.tutorialIntent = intent;
    }

    public static /* synthetic */ ProductHelpCenter copy$default(ProductHelpCenter productHelpCenter, String str, String str2, String str3, int i11, String str4, long j5, long j11, Intent intent, int i12, Object obj) {
        String str5;
        String str6;
        String str7;
        int i13;
        String str8;
        long j12;
        long j13;
        Intent intent2;
        if ((i12 & 1) != 0) {
            str5 = productHelpCenter.productName;
        } else {
            str5 = str;
        }
        if ((i12 & 2) != 0) {
            str6 = productHelpCenter.productInfo;
        } else {
            str6 = str2;
        }
        if ((i12 & 4) != 0) {
            str7 = productHelpCenter.productUrl;
        } else {
            str7 = str3;
        }
        if ((i12 & 8) != 0) {
            i13 = productHelpCenter.productRes;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            str8 = productHelpCenter.productImageUrl;
        } else {
            str8 = str4;
        }
        if ((i12 & 32) != 0) {
            j12 = productHelpCenter.categoryId;
        } else {
            j12 = j5;
        }
        if ((i12 & 64) != 0) {
            j13 = productHelpCenter.sectionId;
        } else {
            j13 = j11;
        }
        if ((i12 & 128) != 0) {
            intent2 = productHelpCenter.tutorialIntent;
        } else {
            intent2 = intent;
        }
        return productHelpCenter.copy(str5, str6, str7, i13, str8, j12, j13, intent2);
    }

    public final String component1() {
        return this.productName;
    }

    public final String component2() {
        return this.productInfo;
    }

    public final String component3() {
        return this.productUrl;
    }

    public final int component4() {
        return this.productRes;
    }

    public final String component5() {
        return this.productImageUrl;
    }

    public final long component6() {
        return this.categoryId;
    }

    public final long component7() {
        return this.sectionId;
    }

    public final Intent component8() {
        return this.tutorialIntent;
    }

    public final ProductHelpCenter copy(String productName, String productInfo, String productUrl, int i11, String productImageUrl, long j5, long j11, Intent intent) {
        u.j(productName, "productName");
        u.j(productInfo, "productInfo");
        u.j(productUrl, "productUrl");
        u.j(productImageUrl, "productImageUrl");
        return new ProductHelpCenter(productName, productInfo, productUrl, i11, productImageUrl, j5, j11, intent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductHelpCenter)) {
            return false;
        }
        ProductHelpCenter productHelpCenter = (ProductHelpCenter) obj;
        if (u.e(this.productName, productHelpCenter.productName) && u.e(this.productInfo, productHelpCenter.productInfo) && u.e(this.productUrl, productHelpCenter.productUrl) && this.productRes == productHelpCenter.productRes && u.e(this.productImageUrl, productHelpCenter.productImageUrl) && this.categoryId == productHelpCenter.categoryId && this.sectionId == productHelpCenter.sectionId && u.e(this.tutorialIntent, productHelpCenter.tutorialIntent)) {
            return true;
        }
        return false;
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final String getProductImageUrl() {
        return this.productImageUrl;
    }

    public final String getProductInfo() {
        return this.productInfo;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final int getProductRes() {
        return this.productRes;
    }

    public final String getProductUrl() {
        return this.productUrl;
    }

    public final long getSectionId() {
        return this.sectionId;
    }

    public final Intent getTutorialIntent() {
        return this.tutorialIntent;
    }

    public int hashCode() {
        int hashCode;
        int a11 = androidx.activity.result.c.a(this.sectionId, androidx.activity.result.c.a(this.categoryId, defpackage.d.c(this.productImageUrl, h.a(this.productRes, defpackage.d.c(this.productUrl, defpackage.d.c(this.productInfo, this.productName.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        Intent intent = this.tutorialIntent;
        if (intent == null) {
            hashCode = 0;
        } else {
            hashCode = intent.hashCode();
        }
        return a11 + hashCode;
    }

    public String toString() {
        String str = this.productName;
        String str2 = this.productInfo;
        String str3 = this.productUrl;
        int i11 = this.productRes;
        String str4 = this.productImageUrl;
        long j5 = this.categoryId;
        long j11 = this.sectionId;
        Intent intent = this.tutorialIntent;
        StringBuilder b10 = l0.b("ProductHelpCenter(productName=", str, ", productInfo=", str2, ", productUrl=");
        b10.append(str3);
        b10.append(", productRes=");
        b10.append(i11);
        b10.append(", productImageUrl=");
        b10.append(str4);
        b10.append(", categoryId=");
        b10.append(j5);
        g.d(b10, ", sectionId=", j11, ", tutorialIntent=");
        b10.append(intent);
        b10.append(")");
        return b10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.productName);
        out.writeString(this.productInfo);
        out.writeString(this.productUrl);
        out.writeInt(this.productRes);
        out.writeString(this.productImageUrl);
        out.writeLong(this.categoryId);
        out.writeLong(this.sectionId);
        out.writeParcelable(this.tutorialIntent, i11);
    }
}
