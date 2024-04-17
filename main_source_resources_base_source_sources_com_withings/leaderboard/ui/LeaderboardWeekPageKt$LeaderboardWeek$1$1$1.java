package com.withings.leaderboard.ui;

import androidx.compose.foundation.h;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.text.b;
import com.withings.common.compose.component.AvatarSize;
import com.withings.common.compose.component.c;
import com.withings.common.compose.component.o;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.a0;
import y2.l;
import ym0.p;
import ym0.q;
/* compiled from: LeaderboardWeekPage.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LeaderboardWeekPageKt$LeaderboardWeek$1$1$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ long $data5FontSize;
    final /* synthetic */ String $glyphCup;
    final /* synthetic */ l $glyphFontFamily;
    final /* synthetic */ int $index;
    final /* synthetic */ LeaderboardEntry $item;
    final /* synthetic */ List<LeaderboardEntry> $list;
    final /* synthetic */ ym0.l<LeaderboardEntry, y> $onClick;
    final /* synthetic */ ym0.l<LeaderboardEntry, y> $onLongClick;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardWeekPage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.leaderboard.ui.LeaderboardWeekPageKt$LeaderboardWeek$1$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends w implements ym0.a<y> {
        final /* synthetic */ LeaderboardEntry $item;
        final /* synthetic */ ym0.l<LeaderboardEntry, y> $onLongClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ym0.l<? super LeaderboardEntry, y> lVar, LeaderboardEntry leaderboardEntry) {
            super(0);
            this.$onLongClick = lVar;
            this.$item = leaderboardEntry;
        }

        @Override // ym0.a
        public /* bridge */ /* synthetic */ y invoke() {
            invoke2();
            return y.f85009a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onLongClick.invoke(this.$item);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardWeekPage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.leaderboard.ui.LeaderboardWeekPageKt$LeaderboardWeek$1$1$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends w implements ym0.a<y> {
        final /* synthetic */ LeaderboardEntry $item;
        final /* synthetic */ ym0.l<LeaderboardEntry, y> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ym0.l<? super LeaderboardEntry, y> lVar, LeaderboardEntry leaderboardEntry) {
            super(0);
            this.$onClick = lVar;
            this.$item = leaderboardEntry;
        }

        @Override // ym0.a
        public /* bridge */ /* synthetic */ y invoke() {
            invoke2();
            return y.f85009a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onClick.invoke(this.$item);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeaderboardWeekPageKt$LeaderboardWeek$1$1$1(int i11, List<LeaderboardEntry> list, LeaderboardEntry leaderboardEntry, long j5, ym0.l<? super LeaderboardEntry, y> lVar, ym0.l<? super LeaderboardEntry, y> lVar2, long j11, l lVar3, String str) {
        super(2);
        this.$index = i11;
        this.$list = list;
        this.$item = leaderboardEntry;
        this.$userId = j5;
        this.$onLongClick = lVar;
        this.$onClick = lVar2;
        this.$data5FontSize = j11;
        this.$glyphFontFamily = lVar3;
        this.$glyphCup = str;
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
        boolean z5 = this.$index != x.M(this.$list);
        e h11 = x0.h(h.c(e.f8927a, this.$item.getUserid() != this.$userId, new AnonymousClass1(this.$onLongClick, this.$item), new AnonymousClass2(this.$onClick, this.$item)), yk.h.o(), 0.0f, 2);
        String firstname = this.$item.getFirstname();
        String format = NumberFormat.getInstance().format(Integer.valueOf(this.$item.getScore()));
        long j5 = this.$data5FontSize;
        int i12 = this.$index;
        l lVar = this.$glyphFontFamily;
        String str = this.$glyphCup;
        b.a aVar2 = new b.a();
        int h12 = aVar2.h(new androidx.compose.ui.text.x(0L, j5, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65533));
        try {
            if (i12 == 0) {
                int h13 = aVar2.h(new androidx.compose.ui.text.x(0L, 0L, null, null, null, lVar, null, 0L, null, null, null, 0L, null, null, 65503));
                aVar2.d(str);
                y yVar = y.f85009a;
                aVar2.f(h13);
            } else {
                String format2 = NumberFormat.getNumberInstance().format(Integer.valueOf(i12 + 1));
                u.i(format2, "format(...)");
                aVar2.d(format2);
            }
            y yVar2 = y.f85009a;
            aVar2.f(h12);
            o.n(h11, s1.b.b(aVar, 1302785136, new AnonymousClass4(this.$item)), firstname, format, aVar2.i(), false, z5, false, null, null, aVar, 48, 928);
        } catch (Throwable th2) {
            aVar2.f(h12);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardWeekPage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr0/a0;", "Lnm0/y;", "invoke", "(Lr0/a0;Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.leaderboard.ui.LeaderboardWeekPageKt$LeaderboardWeek$1$1$1$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends w implements q<a0, a, Integer, y> {
        final /* synthetic */ LeaderboardEntry $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(LeaderboardEntry leaderboardEntry) {
            super(3);
            this.$item = leaderboardEntry;
        }

        public final void invoke(a0 LabelValueCell, a aVar, int i11) {
            u.j(LabelValueCell, "$this$LabelValueCell");
            if ((i11 & 81) == 16 && aVar.h()) {
                aVar.C();
                return;
            }
            e j5 = x0.j(e.f8927a, 0.0f, 0.0f, yk.h.o(), 0.0f, 11);
            String firstname = this.$item.getFirstname();
            String lastName = this.$item.getLastName();
            String imageUrl = this.$item.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "no-url";
            }
            long millis = this.$item.getModified().getMillis();
            c.b(j5, firstname, lastName, imageUrl + "?modified=" + millis, AvatarSize.f33299d, 0L, 0L, false, null, aVar, 24576, 480);
        }

        @Override // ym0.q
        public /* bridge */ /* synthetic */ y invoke(a0 a0Var, a aVar, Integer num) {
            invoke(a0Var, aVar, num.intValue());
            return y.f85009a;
        }
    }
}
