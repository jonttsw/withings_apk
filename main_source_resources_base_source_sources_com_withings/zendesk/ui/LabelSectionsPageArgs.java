package com.withings.zendesk.ui;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u0;
import com.google.firebase.messaging.Constants;
import com.withings.zendesk.models.ZendeskLabel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import r8.f;
/* compiled from: LabelSectionsPageArgs.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010\r¨\u0006$"}, d2 = {"Lcom/withings/zendesk/ui/LabelSectionsPageArgs;", "Lr8/f;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/u0;", "toSavedStateHandle", "()Landroidx/lifecycle/u0;", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "component1", "()Lcom/withings/zendesk/ui/ProductHelpCenter;", "Lcom/withings/zendesk/models/ZendeskLabel;", "component2", "()Lcom/withings/zendesk/models/ZendeskLabel;", "productInfo", Constants.ScionAnalytics.PARAM_LABEL, "copy", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;)Lcom/withings/zendesk/ui/LabelSectionsPageArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "getProductInfo", "Lcom/withings/zendesk/models/ZendeskLabel;", "getLabel", "<init>", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;)V", "Companion", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LabelSectionsPageArgs implements f {
    private final ZendeskLabel label;
    private final ProductHelpCenter productInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LabelSectionsPageArgs.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/zendesk/ui/LabelSectionsPageArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/withings/zendesk/ui/LabelSectionsPageArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/withings/zendesk/ui/LabelSectionsPageArgs;", "Landroidx/lifecycle/u0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/u0;)Lcom/withings/zendesk/ui/LabelSectionsPageArgs;", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final LabelSectionsPageArgs fromBundle(Bundle bundle) {
            u.j(bundle, "bundle");
            bundle.setClassLoader(LabelSectionsPageArgs.class.getClassLoader());
            if (bundle.containsKey("productInfo")) {
                if (!Parcelable.class.isAssignableFrom(ProductHelpCenter.class) && !Serializable.class.isAssignableFrom(ProductHelpCenter.class)) {
                    throw new UnsupportedOperationException(ProductHelpCenter.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                ProductHelpCenter productHelpCenter = (ProductHelpCenter) bundle.get("productInfo");
                if (productHelpCenter != null) {
                    if (bundle.containsKey(Constants.ScionAnalytics.PARAM_LABEL)) {
                        if (!Parcelable.class.isAssignableFrom(ZendeskLabel.class) && !Serializable.class.isAssignableFrom(ZendeskLabel.class)) {
                            throw new UnsupportedOperationException(ZendeskLabel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                        }
                        ZendeskLabel zendeskLabel = (ZendeskLabel) bundle.get(Constants.ScionAnalytics.PARAM_LABEL);
                        if (zendeskLabel != null) {
                            return new LabelSectionsPageArgs(productHelpCenter, zendeskLabel);
                        }
                        throw new IllegalArgumentException("Argument \"label\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Required argument \"label\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Argument \"productInfo\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"productInfo\" is missing and does not have an android:defaultValue");
        }

        public final LabelSectionsPageArgs fromSavedStateHandle(u0 savedStateHandle) {
            u.j(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.b("productInfo")) {
                if (!Parcelable.class.isAssignableFrom(ProductHelpCenter.class) && !Serializable.class.isAssignableFrom(ProductHelpCenter.class)) {
                    throw new UnsupportedOperationException(ProductHelpCenter.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                ProductHelpCenter productHelpCenter = (ProductHelpCenter) savedStateHandle.c("productInfo");
                if (productHelpCenter != null) {
                    if (savedStateHandle.b(Constants.ScionAnalytics.PARAM_LABEL)) {
                        if (!Parcelable.class.isAssignableFrom(ZendeskLabel.class) && !Serializable.class.isAssignableFrom(ZendeskLabel.class)) {
                            throw new UnsupportedOperationException(ZendeskLabel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                        }
                        ZendeskLabel zendeskLabel = (ZendeskLabel) savedStateHandle.c(Constants.ScionAnalytics.PARAM_LABEL);
                        if (zendeskLabel != null) {
                            return new LabelSectionsPageArgs(productHelpCenter, zendeskLabel);
                        }
                        throw new IllegalArgumentException("Argument \"label\" is marked as non-null but was passed a null value");
                    }
                    throw new IllegalArgumentException("Required argument \"label\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Argument \"productInfo\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"productInfo\" is missing and does not have an android:defaultValue");
        }

        private Companion() {
        }
    }

    public LabelSectionsPageArgs(ProductHelpCenter productInfo, ZendeskLabel label) {
        u.j(productInfo, "productInfo");
        u.j(label, "label");
        this.productInfo = productInfo;
        this.label = label;
    }

    public static /* synthetic */ LabelSectionsPageArgs copy$default(LabelSectionsPageArgs labelSectionsPageArgs, ProductHelpCenter productHelpCenter, ZendeskLabel zendeskLabel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productHelpCenter = labelSectionsPageArgs.productInfo;
        }
        if ((i11 & 2) != 0) {
            zendeskLabel = labelSectionsPageArgs.label;
        }
        return labelSectionsPageArgs.copy(productHelpCenter, zendeskLabel);
    }

    public static final LabelSectionsPageArgs fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public static final LabelSectionsPageArgs fromSavedStateHandle(u0 u0Var) {
        return Companion.fromSavedStateHandle(u0Var);
    }

    public final ProductHelpCenter component1() {
        return this.productInfo;
    }

    public final ZendeskLabel component2() {
        return this.label;
    }

    public final LabelSectionsPageArgs copy(ProductHelpCenter productInfo, ZendeskLabel label) {
        u.j(productInfo, "productInfo");
        u.j(label, "label");
        return new LabelSectionsPageArgs(productInfo, label);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelSectionsPageArgs)) {
            return false;
        }
        LabelSectionsPageArgs labelSectionsPageArgs = (LabelSectionsPageArgs) obj;
        if (u.e(this.productInfo, labelSectionsPageArgs.productInfo) && u.e(this.label, labelSectionsPageArgs.label)) {
            return true;
        }
        return false;
    }

    public final ZendeskLabel getLabel() {
        return this.label;
    }

    public final ProductHelpCenter getProductInfo() {
        return this.productInfo;
    }

    public int hashCode() {
        return this.label.hashCode() + (this.productInfo.hashCode() * 31);
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
        if (Parcelable.class.isAssignableFrom(ZendeskLabel.class)) {
            ZendeskLabel zendeskLabel = this.label;
            u.h(zendeskLabel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable(Constants.ScionAnalytics.PARAM_LABEL, zendeskLabel);
        } else if (Serializable.class.isAssignableFrom(ZendeskLabel.class)) {
            ZendeskLabel zendeskLabel2 = this.label;
            u.h(zendeskLabel2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable(Constants.ScionAnalytics.PARAM_LABEL, (Serializable) zendeskLabel2);
        } else {
            throw new UnsupportedOperationException(ZendeskLabel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
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
        if (Parcelable.class.isAssignableFrom(ZendeskLabel.class)) {
            ZendeskLabel zendeskLabel = this.label;
            u.h(zendeskLabel, "null cannot be cast to non-null type android.os.Parcelable");
            u0Var.e(zendeskLabel, Constants.ScionAnalytics.PARAM_LABEL);
        } else if (Serializable.class.isAssignableFrom(ZendeskLabel.class)) {
            ZendeskLabel zendeskLabel2 = this.label;
            u.h(zendeskLabel2, "null cannot be cast to non-null type java.io.Serializable");
            u0Var.e((Serializable) zendeskLabel2, Constants.ScionAnalytics.PARAM_LABEL);
        } else {
            throw new UnsupportedOperationException(ZendeskLabel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return u0Var;
    }

    public String toString() {
        ProductHelpCenter productHelpCenter = this.productInfo;
        ZendeskLabel zendeskLabel = this.label;
        return "LabelSectionsPageArgs(productInfo=" + productHelpCenter + ", label=" + zendeskLabel + ")";
    }
}
