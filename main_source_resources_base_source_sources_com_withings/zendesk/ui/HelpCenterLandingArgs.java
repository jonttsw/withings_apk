package com.withings.zendesk.ui;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import r8.f;
/* compiled from: HelpCenterLandingArgs.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterLandingArgs;", "Lr8/f;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/u0;", "toSavedStateHandle", "()Landroidx/lifecycle/u0;", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "component1", "()Lcom/withings/zendesk/ui/ProductHelpCenter;", "productInfo", "copy", "(Lcom/withings/zendesk/ui/ProductHelpCenter;)Lcom/withings/zendesk/ui/HelpCenterLandingArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "getProductInfo", "<init>", "(Lcom/withings/zendesk/ui/ProductHelpCenter;)V", "Companion", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterLandingArgs implements f {
    private final ProductHelpCenter productInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HelpCenterLandingArgs.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterLandingArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/withings/zendesk/ui/HelpCenterLandingArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/withings/zendesk/ui/HelpCenterLandingArgs;", "Landroidx/lifecycle/u0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/u0;)Lcom/withings/zendesk/ui/HelpCenterLandingArgs;", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final HelpCenterLandingArgs fromBundle(Bundle bundle) {
            u.j(bundle, "bundle");
            bundle.setClassLoader(HelpCenterLandingArgs.class.getClassLoader());
            if (bundle.containsKey("productInfo")) {
                if (!Parcelable.class.isAssignableFrom(ProductHelpCenter.class) && !Serializable.class.isAssignableFrom(ProductHelpCenter.class)) {
                    throw new UnsupportedOperationException(ProductHelpCenter.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                ProductHelpCenter productHelpCenter = (ProductHelpCenter) bundle.get("productInfo");
                if (productHelpCenter != null) {
                    return new HelpCenterLandingArgs(productHelpCenter);
                }
                throw new IllegalArgumentException("Argument \"productInfo\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"productInfo\" is missing and does not have an android:defaultValue");
        }

        public final HelpCenterLandingArgs fromSavedStateHandle(u0 savedStateHandle) {
            u.j(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.b("productInfo")) {
                if (!Parcelable.class.isAssignableFrom(ProductHelpCenter.class) && !Serializable.class.isAssignableFrom(ProductHelpCenter.class)) {
                    throw new UnsupportedOperationException(ProductHelpCenter.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                ProductHelpCenter productHelpCenter = (ProductHelpCenter) savedStateHandle.c("productInfo");
                if (productHelpCenter != null) {
                    return new HelpCenterLandingArgs(productHelpCenter);
                }
                throw new IllegalArgumentException("Argument \"productInfo\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"productInfo\" is missing and does not have an android:defaultValue");
        }

        private Companion() {
        }
    }

    public HelpCenterLandingArgs(ProductHelpCenter productInfo) {
        u.j(productInfo, "productInfo");
        this.productInfo = productInfo;
    }

    public static /* synthetic */ HelpCenterLandingArgs copy$default(HelpCenterLandingArgs helpCenterLandingArgs, ProductHelpCenter productHelpCenter, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productHelpCenter = helpCenterLandingArgs.productInfo;
        }
        return helpCenterLandingArgs.copy(productHelpCenter);
    }

    public static final HelpCenterLandingArgs fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public static final HelpCenterLandingArgs fromSavedStateHandle(u0 u0Var) {
        return Companion.fromSavedStateHandle(u0Var);
    }

    public final ProductHelpCenter component1() {
        return this.productInfo;
    }

    public final HelpCenterLandingArgs copy(ProductHelpCenter productInfo) {
        u.j(productInfo, "productInfo");
        return new HelpCenterLandingArgs(productInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HelpCenterLandingArgs) && u.e(this.productInfo, ((HelpCenterLandingArgs) obj).productInfo)) {
            return true;
        }
        return false;
    }

    public final ProductHelpCenter getProductInfo() {
        return this.productInfo;
    }

    public int hashCode() {
        return this.productInfo.hashCode();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ProductHelpCenter.class)) {
            ProductHelpCenter productHelpCenter = this.productInfo;
            u.h(productHelpCenter, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("productInfo", productHelpCenter);
        } else if (Serializable.class.isAssignableFrom(ProductHelpCenter.class)) {
            ProductHelpCenter productHelpCenter2 = this.productInfo;
            u.h(productHelpCenter2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("productInfo", (Serializable) productHelpCenter2);
        } else {
            throw new UnsupportedOperationException(ProductHelpCenter.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final u0 toSavedStateHandle() {
        u0 u0Var = new u0();
        if (Parcelable.class.isAssignableFrom(ProductHelpCenter.class)) {
            ProductHelpCenter productHelpCenter = this.productInfo;
            u.h(productHelpCenter, "null cannot be cast to non-null type android.os.Parcelable");
            u0Var.e(productHelpCenter, "productInfo");
        } else if (Serializable.class.isAssignableFrom(ProductHelpCenter.class)) {
            ProductHelpCenter productHelpCenter2 = this.productInfo;
            u.h(productHelpCenter2, "null cannot be cast to non-null type java.io.Serializable");
            u0Var.e((Serializable) productHelpCenter2, "productInfo");
        } else {
            throw new UnsupportedOperationException(ProductHelpCenter.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return u0Var;
    }

    public String toString() {
        ProductHelpCenter productHelpCenter = this.productInfo;
        return "HelpCenterLandingArgs(productInfo=" + productHelpCenter + ")";
    }
}
