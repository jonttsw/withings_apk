package com.withings.zendesk.ui;

import com.withings.zendesk.ui.LabelSectionsPageDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import ym0.l;
import zendesk.support.Section;
/* compiled from: LabelSectionsPage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzendesk/support/Section;", DataLayout.Section.ELEMENT, "Lnm0/y;", "invoke", "(Lzendesk/support/Section;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class LabelSectionsPage$sectionAdapter$1 extends w implements l<Section, y> {
    final /* synthetic */ LabelSectionsPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelSectionsPage$sectionAdapter$1(LabelSectionsPage labelSectionsPage) {
        super(1);
        this.this$0 = labelSectionsPage;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Section section) {
        invoke2(section);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Section section) {
        LabelSectionsPageArgs args;
        LabelSectionsPageArgs args2;
        u.j(section, "section");
        androidx.navigation.e a11 = ah.e.a(this.this$0);
        LabelSectionsPageDirections.Companion companion = LabelSectionsPageDirections.Companion;
        args = this.this$0.getArgs();
        ProductHelpCenter productInfo = args.getProductInfo();
        args2 = this.this$0.getArgs();
        a11.K(LabelSectionsPageDirections.Companion.showArticleForSectionAndLabel$default(companion, productInfo, args2.getLabel(), section, false, 8, null));
    }
}
