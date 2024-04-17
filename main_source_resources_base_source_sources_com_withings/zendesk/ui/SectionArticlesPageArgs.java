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
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import r8.f;
import zendesk.support.Section;
/* compiled from: SectionArticlesPageArgs.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B)\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b,\u0010-J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010\nR\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010\rR\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b+\u0010\u0013¨\u0006/"}, d2 = {"Lcom/withings/zendesk/ui/SectionArticlesPageArgs;", "Lr8/f;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroidx/lifecycle/u0;", "toSavedStateHandle", "()Landroidx/lifecycle/u0;", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "component1", "()Lcom/withings/zendesk/ui/ProductHelpCenter;", "Lcom/withings/zendesk/models/ZendeskLabel;", "component2", "()Lcom/withings/zendesk/models/ZendeskLabel;", "Lzendesk/support/Section;", "component3", "()Lzendesk/support/Section;", "", "component4", "()Z", "productInfo", Constants.ScionAnalytics.PARAM_LABEL, DataLayout.Section.ELEMENT, "showSectionTitle", "copy", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;Lzendesk/support/Section;Z)Lcom/withings/zendesk/ui/SectionArticlesPageArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "getProductInfo", "Lcom/withings/zendesk/models/ZendeskLabel;", "getLabel", "Lzendesk/support/Section;", "getSection", "Z", "getShowSectionTitle", "<init>", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;Lzendesk/support/Section;Z)V", "Companion", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SectionArticlesPageArgs implements f {
    private final ZendeskLabel label;
    private final ProductHelpCenter productInfo;
    private final Section section;
    private final boolean showSectionTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SectionArticlesPageArgs.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/zendesk/ui/SectionArticlesPageArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/withings/zendesk/ui/SectionArticlesPageArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/withings/zendesk/ui/SectionArticlesPageArgs;", "Landroidx/lifecycle/u0;", "savedStateHandle", "fromSavedStateHandle", "(Landroidx/lifecycle/u0;)Lcom/withings/zendesk/ui/SectionArticlesPageArgs;", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final SectionArticlesPageArgs fromBundle(Bundle bundle) {
            boolean z5;
            u.j(bundle, "bundle");
            bundle.setClassLoader(SectionArticlesPageArgs.class.getClassLoader());
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
                            if (bundle.containsKey(DataLayout.Section.ELEMENT)) {
                                if (!Parcelable.class.isAssignableFrom(Section.class) && !Serializable.class.isAssignableFrom(Section.class)) {
                                    throw new UnsupportedOperationException(Section.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                Section section = (Section) bundle.get(DataLayout.Section.ELEMENT);
                                if (section != null) {
                                    if (bundle.containsKey("showSectionTitle")) {
                                        z5 = bundle.getBoolean("showSectionTitle");
                                    } else {
                                        z5 = true;
                                    }
                                    return new SectionArticlesPageArgs(productHelpCenter, zendeskLabel, section, z5);
                                }
                                throw new IllegalArgumentException("Argument \"section\" is marked as non-null but was passed a null value.");
                            }
                            throw new IllegalArgumentException("Required argument \"section\" is missing and does not have an android:defaultValue");
                        }
                        throw new IllegalArgumentException("Argument \"label\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Required argument \"label\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Argument \"productInfo\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"productInfo\" is missing and does not have an android:defaultValue");
        }

        public final SectionArticlesPageArgs fromSavedStateHandle(u0 savedStateHandle) {
            Boolean bool;
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
                            if (savedStateHandle.b(DataLayout.Section.ELEMENT)) {
                                if (!Parcelable.class.isAssignableFrom(Section.class) && !Serializable.class.isAssignableFrom(Section.class)) {
                                    throw new UnsupportedOperationException(Section.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                Section section = (Section) savedStateHandle.c(DataLayout.Section.ELEMENT);
                                if (section != null) {
                                    if (savedStateHandle.b("showSectionTitle")) {
                                        bool = (Boolean) savedStateHandle.c("showSectionTitle");
                                        if (bool == null) {
                                            throw new IllegalArgumentException("Argument \"showSectionTitle\" of type boolean does not support null values");
                                        }
                                    } else {
                                        bool = Boolean.TRUE;
                                    }
                                    return new SectionArticlesPageArgs(productHelpCenter, zendeskLabel, section, bool.booleanValue());
                                }
                                throw new IllegalArgumentException("Argument \"section\" is marked as non-null but was passed a null value");
                            }
                            throw new IllegalArgumentException("Required argument \"section\" is missing and does not have an android:defaultValue");
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

    public SectionArticlesPageArgs(ProductHelpCenter productInfo, ZendeskLabel label, Section section, boolean z5) {
        u.j(productInfo, "productInfo");
        u.j(label, "label");
        u.j(section, "section");
        this.productInfo = productInfo;
        this.label = label;
        this.section = section;
        this.showSectionTitle = z5;
    }

    public static /* synthetic */ SectionArticlesPageArgs copy$default(SectionArticlesPageArgs sectionArticlesPageArgs, ProductHelpCenter productHelpCenter, ZendeskLabel zendeskLabel, Section section, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productHelpCenter = sectionArticlesPageArgs.productInfo;
        }
        if ((i11 & 2) != 0) {
            zendeskLabel = sectionArticlesPageArgs.label;
        }
        if ((i11 & 4) != 0) {
            section = sectionArticlesPageArgs.section;
        }
        if ((i11 & 8) != 0) {
            z5 = sectionArticlesPageArgs.showSectionTitle;
        }
        return sectionArticlesPageArgs.copy(productHelpCenter, zendeskLabel, section, z5);
    }

    public static final SectionArticlesPageArgs fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public static final SectionArticlesPageArgs fromSavedStateHandle(u0 u0Var) {
        return Companion.fromSavedStateHandle(u0Var);
    }

    public final ProductHelpCenter component1() {
        return this.productInfo;
    }

    public final ZendeskLabel component2() {
        return this.label;
    }

    public final Section component3() {
        return this.section;
    }

    public final boolean component4() {
        return this.showSectionTitle;
    }

    public final SectionArticlesPageArgs copy(ProductHelpCenter productInfo, ZendeskLabel label, Section section, boolean z5) {
        u.j(productInfo, "productInfo");
        u.j(label, "label");
        u.j(section, "section");
        return new SectionArticlesPageArgs(productInfo, label, section, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionArticlesPageArgs)) {
            return false;
        }
        SectionArticlesPageArgs sectionArticlesPageArgs = (SectionArticlesPageArgs) obj;
        if (u.e(this.productInfo, sectionArticlesPageArgs.productInfo) && u.e(this.label, sectionArticlesPageArgs.label) && u.e(this.section, sectionArticlesPageArgs.section) && this.showSectionTitle == sectionArticlesPageArgs.showSectionTitle) {
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

    public final Section getSection() {
        return this.section;
    }

    public final boolean getShowSectionTitle() {
        return this.showSectionTitle;
    }

    public int hashCode() {
        int hashCode = this.label.hashCode();
        int hashCode2 = this.section.hashCode();
        return Boolean.hashCode(this.showSectionTitle) + ((hashCode2 + ((hashCode + (this.productInfo.hashCode() * 31)) * 31)) * 31);
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
        if (Parcelable.class.isAssignableFrom(Section.class)) {
            Section section = this.section;
            u.h(section, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable(DataLayout.Section.ELEMENT, (Parcelable) section);
        } else if (Serializable.class.isAssignableFrom(Section.class)) {
            Section section2 = this.section;
            u.h(section2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable(DataLayout.Section.ELEMENT, section2);
        } else {
            throw new UnsupportedOperationException(Section.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putBoolean("showSectionTitle", this.showSectionTitle);
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
        if (Parcelable.class.isAssignableFrom(Section.class)) {
            Section section = this.section;
            u.h(section, "null cannot be cast to non-null type android.os.Parcelable");
            u0Var.e((Parcelable) section, DataLayout.Section.ELEMENT);
        } else if (Serializable.class.isAssignableFrom(Section.class)) {
            Section section2 = this.section;
            u.h(section2, "null cannot be cast to non-null type java.io.Serializable");
            u0Var.e(section2, DataLayout.Section.ELEMENT);
        } else {
            throw new UnsupportedOperationException(Section.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        u0Var.e(Boolean.valueOf(this.showSectionTitle), "showSectionTitle");
        return u0Var;
    }

    public String toString() {
        ProductHelpCenter productHelpCenter = this.productInfo;
        ZendeskLabel zendeskLabel = this.label;
        Section section = this.section;
        boolean z5 = this.showSectionTitle;
        return "SectionArticlesPageArgs(productInfo=" + productHelpCenter + ", label=" + zendeskLabel + ", section=" + section + ", showSectionTitle=" + z5 + ")";
    }

    public /* synthetic */ SectionArticlesPageArgs(ProductHelpCenter productHelpCenter, ZendeskLabel zendeskLabel, Section section, boolean z5, int i11, m mVar) {
        this(productHelpCenter, zendeskLabel, section, (i11 & 8) != 0 ? true : z5);
    }
}
