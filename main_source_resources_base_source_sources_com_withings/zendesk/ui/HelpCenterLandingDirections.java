package com.withings.zendesk.ui;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.withings.zendesk.HelpCenterNavGraphDirections;
import com.withings.zendesk.R;
import com.withings.zendesk.models.ZendeskLabel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import r8.l;
import zendesk.support.Section;
/* compiled from: HelpCenterLandingDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterLandingDirections;", "", "()V", "Companion", "ShowArticleForSectionAndLabel", "ShowSectionsForLabel", "zendesk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HelpCenterLandingDirections {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: HelpCenterLandingDirections.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterLandingDirections$Companion;", "", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "productInfo", "Lcom/withings/zendesk/models/ZendeskLabel;", Constants.ScionAnalytics.PARAM_LABEL, "Lr8/l;", "showSectionsForLabel", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;)Lr8/l;", "Lzendesk/support/Section;", DataLayout.Section.ELEMENT, "", "showSectionTitle", "showArticleForSectionAndLabel", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;Lzendesk/support/Section;Z)Lr8/l;", "", "articleId", "showArticle", "(J)Lr8/l;", "goToSearch", "()Lr8/l;", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public static /* synthetic */ l showArticleForSectionAndLabel$default(Companion companion, ProductHelpCenter productHelpCenter, ZendeskLabel zendeskLabel, Section section, boolean z5, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z5 = true;
            }
            return companion.showArticleForSectionAndLabel(productHelpCenter, zendeskLabel, section, z5);
        }

        public final l goToSearch() {
            return HelpCenterNavGraphDirections.Companion.goToSearch();
        }

        public final l showArticle(long j5) {
            return HelpCenterNavGraphDirections.Companion.showArticle(j5);
        }

        public final l showArticleForSectionAndLabel(ProductHelpCenter productInfo, ZendeskLabel label, Section section, boolean z5) {
            u.j(productInfo, "productInfo");
            u.j(label, "label");
            u.j(section, "section");
            return new ShowArticleForSectionAndLabel(productInfo, label, section, z5);
        }

        public final l showSectionsForLabel(ProductHelpCenter productInfo, ZendeskLabel label) {
            u.j(productInfo, "productInfo");
            u.j(label, "label");
            return new ShowSectionsForLabel(productInfo, label);
        }

        private Companion() {
        }
    }

    /* compiled from: HelpCenterLandingDirections.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007R\u001a\u0010\u001b\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterLandingDirections$ShowSectionsForLabel;", "Lr8/l;", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "component1", "()Lcom/withings/zendesk/ui/ProductHelpCenter;", "Lcom/withings/zendesk/models/ZendeskLabel;", "component2", "()Lcom/withings/zendesk/models/ZendeskLabel;", "productInfo", Constants.ScionAnalytics.PARAM_LABEL, "copy", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;)Lcom/withings/zendesk/ui/HelpCenterLandingDirections$ShowSectionsForLabel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "getProductInfo", "Lcom/withings/zendesk/models/ZendeskLabel;", "getLabel", "actionId", "I", "getActionId", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "<init>", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    private static final class ShowSectionsForLabel implements l {
        private final int actionId;
        private final ZendeskLabel label;
        private final ProductHelpCenter productInfo;

        public ShowSectionsForLabel(ProductHelpCenter productInfo, ZendeskLabel label) {
            u.j(productInfo, "productInfo");
            u.j(label, "label");
            this.productInfo = productInfo;
            this.label = label;
            this.actionId = R.id.showSectionsForLabel;
        }

        public static /* synthetic */ ShowSectionsForLabel copy$default(ShowSectionsForLabel showSectionsForLabel, ProductHelpCenter productHelpCenter, ZendeskLabel zendeskLabel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                productHelpCenter = showSectionsForLabel.productInfo;
            }
            if ((i11 & 2) != 0) {
                zendeskLabel = showSectionsForLabel.label;
            }
            return showSectionsForLabel.copy(productHelpCenter, zendeskLabel);
        }

        public final ProductHelpCenter component1() {
            return this.productInfo;
        }

        public final ZendeskLabel component2() {
            return this.label;
        }

        public final ShowSectionsForLabel copy(ProductHelpCenter productInfo, ZendeskLabel label) {
            u.j(productInfo, "productInfo");
            u.j(label, "label");
            return new ShowSectionsForLabel(productInfo, label);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSectionsForLabel)) {
                return false;
            }
            ShowSectionsForLabel showSectionsForLabel = (ShowSectionsForLabel) obj;
            if (u.e(this.productInfo, showSectionsForLabel.productInfo) && u.e(this.label, showSectionsForLabel.label)) {
                return true;
            }
            return false;
        }

        @Override // r8.l
        public int getActionId() {
            return this.actionId;
        }

        @Override // r8.l
        public Bundle getArguments() {
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

        public final ZendeskLabel getLabel() {
            return this.label;
        }

        public final ProductHelpCenter getProductInfo() {
            return this.productInfo;
        }

        public int hashCode() {
            return this.label.hashCode() + (this.productInfo.hashCode() * 31);
        }

        public String toString() {
            ProductHelpCenter productHelpCenter = this.productInfo;
            ZendeskLabel zendeskLabel = this.label;
            return "ShowSectionsForLabel(productInfo=" + productHelpCenter + ", label=" + zendeskLabel + ")";
        }
    }

    private HelpCenterLandingDirections() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HelpCenterLandingDirections.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\u0007R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010\nR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterLandingDirections$ShowArticleForSectionAndLabel;", "Lr8/l;", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "component1", "()Lcom/withings/zendesk/ui/ProductHelpCenter;", "Lcom/withings/zendesk/models/ZendeskLabel;", "component2", "()Lcom/withings/zendesk/models/ZendeskLabel;", "Lzendesk/support/Section;", "component3", "()Lzendesk/support/Section;", "", "component4", "()Z", "productInfo", Constants.ScionAnalytics.PARAM_LABEL, DataLayout.Section.ELEMENT, "showSectionTitle", "copy", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;Lzendesk/support/Section;Z)Lcom/withings/zendesk/ui/HelpCenterLandingDirections$ShowArticleForSectionAndLabel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "getProductInfo", "Lcom/withings/zendesk/models/ZendeskLabel;", "getLabel", "Lzendesk/support/Section;", "getSection", "Z", "getShowSectionTitle", "actionId", "I", "getActionId", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "<init>", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/models/ZendeskLabel;Lzendesk/support/Section;Z)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class ShowArticleForSectionAndLabel implements l {
        private final int actionId;
        private final ZendeskLabel label;
        private final ProductHelpCenter productInfo;
        private final Section section;
        private final boolean showSectionTitle;

        public ShowArticleForSectionAndLabel(ProductHelpCenter productInfo, ZendeskLabel label, Section section, boolean z5) {
            u.j(productInfo, "productInfo");
            u.j(label, "label");
            u.j(section, "section");
            this.productInfo = productInfo;
            this.label = label;
            this.section = section;
            this.showSectionTitle = z5;
            this.actionId = R.id.showArticleForSectionAndLabel;
        }

        public static /* synthetic */ ShowArticleForSectionAndLabel copy$default(ShowArticleForSectionAndLabel showArticleForSectionAndLabel, ProductHelpCenter productHelpCenter, ZendeskLabel zendeskLabel, Section section, boolean z5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                productHelpCenter = showArticleForSectionAndLabel.productInfo;
            }
            if ((i11 & 2) != 0) {
                zendeskLabel = showArticleForSectionAndLabel.label;
            }
            if ((i11 & 4) != 0) {
                section = showArticleForSectionAndLabel.section;
            }
            if ((i11 & 8) != 0) {
                z5 = showArticleForSectionAndLabel.showSectionTitle;
            }
            return showArticleForSectionAndLabel.copy(productHelpCenter, zendeskLabel, section, z5);
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

        public final ShowArticleForSectionAndLabel copy(ProductHelpCenter productInfo, ZendeskLabel label, Section section, boolean z5) {
            u.j(productInfo, "productInfo");
            u.j(label, "label");
            u.j(section, "section");
            return new ShowArticleForSectionAndLabel(productInfo, label, section, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowArticleForSectionAndLabel)) {
                return false;
            }
            ShowArticleForSectionAndLabel showArticleForSectionAndLabel = (ShowArticleForSectionAndLabel) obj;
            if (u.e(this.productInfo, showArticleForSectionAndLabel.productInfo) && u.e(this.label, showArticleForSectionAndLabel.label) && u.e(this.section, showArticleForSectionAndLabel.section) && this.showSectionTitle == showArticleForSectionAndLabel.showSectionTitle) {
                return true;
            }
            return false;
        }

        @Override // r8.l
        public int getActionId() {
            return this.actionId;
        }

        @Override // r8.l
        public Bundle getArguments() {
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

        public String toString() {
            ProductHelpCenter productHelpCenter = this.productInfo;
            ZendeskLabel zendeskLabel = this.label;
            Section section = this.section;
            boolean z5 = this.showSectionTitle;
            return "ShowArticleForSectionAndLabel(productInfo=" + productHelpCenter + ", label=" + zendeskLabel + ", section=" + section + ", showSectionTitle=" + z5 + ")";
        }

        public /* synthetic */ ShowArticleForSectionAndLabel(ProductHelpCenter productHelpCenter, ZendeskLabel zendeskLabel, Section section, boolean z5, int i11, m mVar) {
            this(productHelpCenter, zendeskLabel, section, (i11 & 8) != 0 ? true : z5);
        }
    }
}
