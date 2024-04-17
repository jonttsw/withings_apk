package com.withings.learnmore.ui;

import androidx.compose.runtime.a;
import ay.b;
import com.withings.learnmore.adapter.LearnMoreEntry;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import uj.c;
import ym0.p;
/* compiled from: LearnMoreScreens.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.withings.learnmore.ui.ComposableSingletons$LearnMoreScreensKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$LearnMoreScreensKt$lambda1$1 extends w implements p<a, Integer, y> {
    public static final ComposableSingletons$LearnMoreScreensKt$lambda1$1 INSTANCE = new ComposableSingletons$LearnMoreScreensKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LearnMoreScreens.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.learnmore.ui.ComposableSingletons$LearnMoreScreensKt$lambda-1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends w implements ym0.a<y> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // ym0.a
        public /* bridge */ /* synthetic */ y invoke() {
            invoke2();
            return y.f85009a;
        }
    }

    ComposableSingletons$LearnMoreScreensKt$lambda1$1() {
        super(2);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
            return;
        }
        LearnMoreEntry learnMoreEntry = new LearnMoreEntry("url", "Here is the title ! It is really long and it should be big enough to take more than 3 lines.", null);
        c.a(b.u(C1987R.string.timelineImageTextCell_tapToRead, aVar), learnMoreEntry.getImageUrl(), learnMoreEntry.getLabel(), 0L, null, AnonymousClass1.INSTANCE, aVar, 196608, 24);
    }
}
