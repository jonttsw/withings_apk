package com.withings.wiscale2.user.ui.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.material.g6;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.k4;
import androidx.compose.ui.platform.n1;
import androidx.core.view.l1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.withings.common.compose.component.AvatarSize;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import com.withings.common.compose.component.l2;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import l70.u;
import x1.b;
import x1.d;
/* compiled from: EditProfileActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/user/ui/profile/EditProfileActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "Lcom/withings/common/compose/component/bottomSheet/BottomSheetType;", "bottomSheetType", "", "pictureUpdated", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EditProfileActivity extends Hilt_EditProfileActivity {
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public y0 f61845g;

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61842j = {androidx.camera.core.v.c(EditProfileActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(EditProfileActivity.class, "shouldFixWeight", "getShouldFixWeight()Z", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final a f61841i = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final y f61843e = new y(this);

    /* renamed from: f  reason: collision with root package name */
    private final z f61844f = new z(this);

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f61846h = nm0.h.b(new a0());

    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, long j5, boolean z5) {
            Intent a11 = com.withings.authentication.n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, EditProfileActivity.class);
            a11.putExtra("extra_fix_weight", z5);
            a11.putExtra("extra_user", j5);
            return a11;
        }
    }

    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    static final class a0 extends kotlin.jvm.internal.w implements ym0.a<s0> {
        a0() {
            super(0);
        }

        @Override // ym0.a
        public final s0 invoke() {
            EditProfileActivity editProfileActivity = EditProfileActivity.this;
            return (s0) new k1(editProfileActivity, new e0(editProfileActivity)).a(s0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f61849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f61849b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f61849b | 1);
            EditProfileActivity.this.z3(aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61850a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.r0<Boolean> r0Var) {
            super(0);
            this.f61850a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f61850a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k1.r0<Boolean> r0Var, k1.r0<Boolean> r0Var2) {
            super(0);
            this.f61851a = r0Var;
            this.f61852b = r0Var2;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f61851a.setValue(Boolean.FALSE);
            this.f61852b.setValue(Boolean.TRUE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61854b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k1.r0<Boolean> r0Var, k1.r0<Boolean> r0Var2) {
            super(0);
            this.f61853a = r0Var;
            this.f61854b = r0Var2;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            Boolean bool = Boolean.FALSE;
            this.f61853a.setValue(bool);
            this.f61854b.setValue(bool);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61856b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61857c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f61858d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k1.r0<Boolean> r0Var, k1.r0<Boolean> r0Var2, int i11) {
            super(2);
            this.f61856b = r0Var;
            this.f61857c = r0Var2;
            this.f61858d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f61858d | 1);
            k1.r0<Boolean> r0Var = this.f61856b;
            k1.r0<Boolean> r0Var2 = this.f61857c;
            EditProfileActivity.this.A3(r0Var, r0Var2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k1.r0<Boolean> r0Var) {
            super(0);
            this.f61859a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f61859a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f61861b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k1.r0<Boolean> r0Var, EditProfileActivity editProfileActivity) {
            super(0);
            this.f61860a = r0Var;
            this.f61861b = editProfileActivity;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f61860a.setValue(Boolean.FALSE);
            s0 L3 = this.f61861b.L3();
            L3.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(L3), Dispatchers.getIO(), null, new i0(L3, null), 2, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61862a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k1.r0<Boolean> r0Var) {
            super(0);
            this.f61862a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f61862a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61864b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f61865c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(k1.r0<Boolean> r0Var, int i11) {
            super(2);
            this.f61864b = r0Var;
            this.f61865c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f61865c | 1);
            EditProfileActivity.this.B3(this.f61864b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(k1.r0<Boolean> r0Var) {
            super(0);
            this.f61866a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f61866a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f61868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m70.l f61869c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(k1.r0<Boolean> r0Var, EditProfileActivity editProfileActivity, m70.l lVar) {
            super(0);
            this.f61867a = r0Var;
            this.f61868b = editProfileActivity;
            this.f61869c = lVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f61867a.setValue(Boolean.FALSE);
            this.f61868b.L3().i1(this.f61869c);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f61871b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(k1.r0<Boolean> r0Var, EditProfileActivity editProfileActivity) {
            super(0);
            this.f61870a = r0Var;
            this.f61871b = editProfileActivity;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f61870a.setValue(Boolean.FALSE);
            s0 L3 = this.f61871b.L3();
            L3.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(L3), null, null, new j0(L3, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61873b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m70.l f61874c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f61875d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(k1.r0<Boolean> r0Var, m70.l lVar, int i11) {
            super(2);
            this.f61873b = r0Var;
            this.f61874c = lVar;
            this.f61875d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f61875d | 1);
            k1.r0<Boolean> r0Var = this.f61873b;
            m70.l lVar = this.f61874c;
            EditProfileActivity.this.C3(r0Var, lVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m70.l f61877b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(m70.l lVar) {
            super(0);
            this.f61877b = lVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            EditProfileActivity.this.L3().O0(this.f61877b);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m70.m f61879b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k4 f61880c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f61881d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k1.r0<BottomSheetType> f61882e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c5 f61883f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(m70.m mVar, k4 k4Var, CoroutineScope coroutineScope, k1.r0<BottomSheetType> r0Var, c5 c5Var) {
            super(2);
            this.f61879b = mVar;
            this.f61880c = k4Var;
            this.f61881d = coroutineScope;
            this.f61882e = r0Var;
            this.f61883f = c5Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                boolean a11 = this.f61879b.a();
                EditProfileActivity.this.D3(512, aVar2, new com.withings.wiscale2.user.ui.profile.l(this.f61880c, this.f61881d, this.f61882e, this.f61883f), a11);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f61884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m70.l f61885b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b2.f f61886c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(b2.f fVar, m70.l lVar, EditProfileActivity editProfileActivity) {
            super(2);
            this.f61884a = editProfileActivity;
            this.f61885b = lVar;
            this.f61886c = fVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._SAVE_, aVar2);
                EditProfileActivity editProfileActivity = this.f61884a;
                boolean booleanValue = ((Boolean) editProfileActivity.L3().V0().getValue()).booleanValue();
                m70.l lVar = this.f61885b;
                if (lVar.a() && lVar.d() && !((Boolean) editProfileActivity.L3().V0().getValue()).booleanValue()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                com.withings.common.compose.component.l.a(null, u11, null, z5, null, null, booleanValue, new com.withings.wiscale2.user.ui.profile.m(this.f61886c, lVar, editProfileActivity), aVar2, 0, 53);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.m f61887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f61888b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f61890d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(m70.m mVar, EditProfileActivity editProfileActivity, k1.r0<Boolean> r0Var, k1.r0<Boolean> r0Var2) {
            super(2);
            this.f61887a = mVar;
            this.f61888b = editProfileActivity;
            this.f61889c = r0Var;
            this.f61890d = r0Var2;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                boolean f11 = this.f61887a.f();
                EditProfileActivity editProfileActivity = this.f61888b;
                if (f11) {
                    aVar2.s(217862756);
                    androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
                    String u11 = ay.b.u(C1987R.string._DELETE_USER_, aVar2);
                    ButtonSize buttonSize = ButtonSize.f33303e;
                    ColorStyle colorStyle = ColorStyle.f33323b;
                    boolean booleanValue = ((Boolean) editProfileActivity.L3().V0().getValue()).booleanValue();
                    aVar2.s(217863121);
                    Object t11 = aVar2.t();
                    if (t11 == a.C0060a.a()) {
                        t11 = new com.withings.wiscale2.user.ui.profile.n(this.f61889c);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    com.withings.common.compose.component.l.c(e11, u11, null, false, colorStyle, buttonSize, booleanValue, (ym0.a) t11, aVar2, 12804102, 12);
                    aVar2.J();
                } else {
                    aVar2.s(217863227);
                    androidx.compose.ui.e e12 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
                    String u12 = ay.b.u(C1987R.string.settings_account_deleteMainAccount_warning_title, aVar2);
                    ButtonSize buttonSize2 = ButtonSize.f33303e;
                    ColorStyle colorStyle2 = ColorStyle.f33323b;
                    boolean booleanValue2 = ((Boolean) editProfileActivity.L3().V0().getValue()).booleanValue();
                    aVar2.s(217863623);
                    Object t12 = aVar2.t();
                    if (t12 == a.C0060a.a()) {
                        t12 = new com.withings.wiscale2.user.ui.profile.o(this.f61890d);
                        aVar2.n(t12);
                    }
                    aVar2.J();
                    com.withings.common.compose.component.l.a(e12, u12, null, false, colorStyle2, buttonSize2, booleanValue2, (ym0.a) t12, aVar2, 12804102, 12);
                    aVar2.J();
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class s extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<BottomSheetType> f61891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f61892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(k1.r0<BottomSheetType> r0Var, EditProfileActivity editProfileActivity) {
            super(2);
            this.f61891a = r0Var;
            this.f61892b = editProfileActivity;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
            if (r10 == null) goto L15;
         */
        @Override // ym0.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final nm0.y invoke(androidx.compose.runtime.a r10, java.lang.Integer r11) {
            /*
                r9 = this;
                r5 = r10
                androidx.compose.runtime.a r5 = (androidx.compose.runtime.a) r5
                java.lang.Number r11 = (java.lang.Number) r11
                int r10 = r11.intValue()
                r10 = r10 & 11
                r11 = 2
                if (r10 != r11) goto L19
                boolean r10 = r5.h()
                if (r10 != 0) goto L15
                goto L19
            L15:
                r5.C()
                goto L4f
            L19:
                androidx.compose.ui.e$a r10 = androidx.compose.ui.e.f8927a
                float r11 = yk.h.o()
                float r0 = yk.h.B()
                androidx.compose.ui.e r6 = androidx.compose.foundation.layout.x0.g(r10, r11, r0)
                com.withings.wiscale2.user.ui.profile.EditProfileActivity$a r10 = com.withings.wiscale2.user.ui.profile.EditProfileActivity.f61841i
                k1.r0<com.withings.common.compose.component.bottomSheet.BottomSheetType> r10 = r9.f61891a
                java.lang.Object r10 = r10.getValue()
                com.withings.common.compose.component.bottomSheet.BottomSheetType r10 = (com.withings.common.compose.component.bottomSheet.BottomSheetType) r10
                if (r10 == 0) goto L42
                int r10 = r10.a()
                com.withings.wiscale2.user.ui.profile.EditProfileActivity r11 = r9.f61892b
                java.lang.String r10 = r11.getString(r10)
                if (r10 != 0) goto L40
                goto L42
            L40:
                r8 = r10
                goto L45
            L42:
                java.lang.String r10 = ""
                goto L40
            L45:
                r3 = 0
                r7 = 0
                r0 = 0
                r1 = 0
                r2 = 28
                nk.a0.g(r0, r1, r2, r3, r5, r6, r7, r8)
            L4f:
                nm0.y r10 = nm0.y.f85009a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.EditProfileActivity.s.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f61894b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c5 f61895c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m70.l f61896d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k1.r0<BottomSheetType> f61897e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(CoroutineScope coroutineScope, c5 c5Var, m70.l lVar, k1.r0<BottomSheetType> r0Var) {
            super(2);
            this.f61894b = coroutineScope;
            this.f61895c = c5Var;
            this.f61896d = lVar;
            this.f61897e = r0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                a aVar3 = EditProfileActivity.f61841i;
                CoroutineScope coroutineScope = this.f61894b;
                c5 c5Var = this.f61895c;
                EditProfileActivity.F3(EditProfileActivity.this, coroutineScope, this.f61897e.getValue(), c5Var, this.f61896d, aVar2, 37384);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class u extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.l f61898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m70.m f61899b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f61900c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k4 f61901d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f61902e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k1.r0<BottomSheetType> f61903f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c5 f61904g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b2.f f61905h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(m70.l lVar, m70.m mVar, EditProfileActivity editProfileActivity, k4 k4Var, CoroutineScope coroutineScope, k1.r0<BottomSheetType> r0Var, c5 c5Var, b2.f fVar) {
            super(3);
            this.f61898a = lVar;
            this.f61899b = mVar;
            this.f61900c = editProfileActivity;
            this.f61901d = k4Var;
            this.f61902e = coroutineScope;
            this.f61903f = r0Var;
            this.f61904g = c5Var;
            this.f61905h = fVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentationWithBottomSheet = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentationWithBottomSheet, "$this$GuidedPresentationWithBottomSheet");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                m70.l lVar = this.f61898a;
                m70.f b10 = lVar.b();
                m70.m mVar = this.f61899b;
                boolean a11 = mVar.a();
                k4 k4Var = this.f61901d;
                CoroutineScope coroutineScope = this.f61902e;
                k1.r0<BottomSheetType> r0Var = this.f61903f;
                c5 c5Var = this.f61904g;
                com.withings.wiscale2.user.ui.profile.p pVar = new com.withings.wiscale2.user.ui.profile.p(k4Var, coroutineScope, r0Var, c5Var);
                com.withings.wiscale2.user.ui.profile.q qVar = new com.withings.wiscale2.user.ui.profile.q(k4Var, coroutineScope, r0Var, c5Var);
                com.withings.wiscale2.user.ui.profile.r rVar = new com.withings.wiscale2.user.ui.profile.r(k4Var, coroutineScope, r0Var, c5Var);
                b2.f fVar = this.f61905h;
                m70.e.a(b10, false, a11, false, 0, pVar, qVar, rVar, new com.withings.wiscale2.user.ui.profile.s(fVar, k4Var), aVar2, 48, 24);
                r0.d0.a(ah.k.p(e1.f(androidx.compose.ui.e.f8927a, yk.h.q())), aVar2);
                EditProfileActivity editProfileActivity = this.f61900c;
                boolean K3 = editProfileActivity.K3();
                m70.k c11 = lVar.c();
                boolean a12 = mVar.a();
                com.withings.wiscale2.user.ui.profile.t tVar = new com.withings.wiscale2.user.ui.profile.t(k4Var, coroutineScope, r0Var, c5Var);
                com.withings.wiscale2.user.ui.profile.u uVar = new com.withings.wiscale2.user.ui.profile.u(k4Var, coroutineScope, r0Var, c5Var);
                com.withings.wiscale2.user.ui.profile.v vVar = new com.withings.wiscale2.user.ui.profile.v(fVar, k4Var);
                int i11 = m70.k.f81664h;
                m70.j.a(false, K3, 0, c11, null, a12, tVar, uVar, null, vVar, aVar2, 0, ConstantsWs.WS_STATUS_UNAUTHORIZED);
                if (kotlin.jvm.internal.u.e(t1.d.a(editProfileActivity.L3().Z0(), aVar2).getValue(), Boolean.TRUE) && mVar.a()) {
                    com.withings.wiscale2.user.ui.profile.a.b(lVar.b(), aVar2, 0);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m70.m f61907b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f61908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(m70.m mVar, int i11) {
            super(2);
            this.f61907b = mVar;
            this.f61908c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f61908c | 1);
            EditProfileActivity.this.E3(this.f61907b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class w {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61909a;

        static {
            int[] iArr = new int[BottomSheetType.values().length];
            try {
                BottomSheetType bottomSheetType = BottomSheetType.f33473b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomSheetType bottomSheetType2 = BottomSheetType.f33473b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BottomSheetType bottomSheetType3 = BottomSheetType.f33473b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BottomSheetType bottomSheetType4 = BottomSheetType.f33473b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BottomSheetType bottomSheetType5 = BottomSheetType.f33473b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                BottomSheetType bottomSheetType6 = BottomSheetType.f33473b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BottomSheetType bottomSheetType7 = BottomSheetType.f33473b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f61909a = iArr;
        }
    }

    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    static final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        x() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -262867122, new b0(EditProfileActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class y implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61911a = nm0.h.b(new c0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61912b;

        public y(Activity activity) {
            this.f61912b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61911a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class z implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61913a = nm0.h.b(new d0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61914b;

        public z(Activity activity) {
            this.f61914b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61913a.getValue();
        }
    }

    public static final void F3(EditProfileActivity editProfileActivity, CoroutineScope coroutineScope, BottomSheetType bottomSheetType, c5 c5Var, m70.l lVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        editProfileActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-372910787);
        if (bottomSheetType == null) {
            i12 = -1;
        } else {
            i12 = w.f61909a[bottomSheetType.ordinal()];
        }
        switch (i12) {
            case 1:
                g11.s(760728202);
                tj.e.b(coroutineScope, lVar.b().k(), c5Var, new com.withings.wiscale2.user.ui.profile.c(lVar), g11, 520 | (i11 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
                break;
            case 2:
                g11.s(760728526);
                tj.e.a(coroutineScope, lVar.b().a(), c5Var, new com.withings.wiscale2.user.ui.profile.d(lVar), g11, 520 | (i11 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
                break;
            case 3:
                g11.s(760728874);
                tj.p.a(coroutineScope, lVar.b().p(), c5Var, new com.withings.wiscale2.user.ui.profile.e(lVar), g11, 520 | (i11 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
                break;
            case 4:
                g11.s(760729198);
                l70.u.f78815b.getClass();
                tj.r.a(coroutineScope, u.a.g(), lVar.c().c(), c5Var, new com.withings.wiscale2.user.ui.profile.f(lVar), g11, 4168 | ((i11 << 3) & 7168));
                g11.J();
                break;
            case 5:
                g11.s(760729614);
                l70.u.f78815b.getClass();
                tj.r.a(coroutineScope, u.a.h(), lVar.c().f(), c5Var, new com.withings.wiscale2.user.ui.profile.g(lVar), g11, 4168 | ((i11 << 3) & 7168));
                g11.J();
                break;
            case 6:
                g11.s(760730030);
                tj.n.a(coroutineScope, c5Var, new com.withings.wiscale2.user.ui.profile.h(editProfileActivity), g11, ((i11 >> 3) & 112) | 72);
                g11.J();
                break;
            case 7:
                g11.s(760730310);
                tj.c.a(coroutineScope, c5Var, new com.withings.wiscale2.user.ui.profile.i(editProfileActivity), g11, ((i11 >> 3) & 112) | 72);
                g11.J();
                break;
            default:
                g11.s(760730555);
                g11.J();
                if (bottomSheetType != null) {
                    throw new IllegalStateException("Bottomsheet content for type " + bottomSheetType + " is not handled in this form");
                }
                break;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.user.ui.profile.j(editProfileActivity, coroutineScope, bottomSheetType, c5Var, lVar, i11));
        }
    }

    public static final void G3(k4 k4Var, CoroutineScope coroutineScope, k1.r0 r0Var, c5 c5Var, BottomSheetType bottomSheetType) {
        r0Var.setValue(bottomSheetType);
        if (k4Var != null) {
            k4Var.a();
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.withings.wiscale2.user.ui.profile.w(c5Var, null), 3, null);
    }

    public static final long I3(EditProfileActivity editProfileActivity) {
        return ((Number) editProfileActivity.f61843e.getValue(editProfileActivity, f61842j[0])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K3() {
        return ((Boolean) this.f61844f.getValue(this, f61842j[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 L3() {
        return (s0) this.f61846h.getValue();
    }

    public final void A3(k1.r0<Boolean> openDialog, k1.r0<Boolean> openBottomSheet, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(openDialog, "openDialog");
        kotlin.jvm.internal.u.j(openBottomSheet, "openBottomSheet");
        androidx.compose.runtime.b g11 = aVar.g(1090415898);
        if ((i11 & 14) == 0) {
            if (g11.K(openDialog)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(openBottomSheet)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            g11.s(916756483);
            int i15 = i12 & 14;
            if (i15 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new c(openDialog);
                g11.n(t11);
            }
            ym0.a aVar2 = (ym0.a) t11;
            g11.J();
            String u11 = ay.b.u(C1987R.string.settings_account_deleteMainAccount_warning_title, g11);
            String u12 = ay.b.u(C1987R.string.settings_account_deleteMainAccount_warning_subtitle, g11);
            String u13 = ay.b.u(C1987R.string._TM_DELETE_, g11);
            long r7 = ((i1) g11.D(j1.e())).r();
            g11.s(916756909);
            if (i15 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i16 = i12 & 112;
            if (i16 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z15 = z11 | z12;
            Object t12 = g11.t();
            if (z15 || t12 == a.C0060a.a()) {
                t12 = new d(openDialog, openBottomSheet);
                g11.n(t12);
            }
            ym0.a aVar3 = (ym0.a) t12;
            g11.J();
            String u14 = ay.b.u(C1987R.string._CANCEL_, g11);
            g11.s(916757112);
            if (i15 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z16 = z13 | z14;
            Object t13 = g11.t();
            if (z16 || t13 == a.C0060a.a()) {
                t13 = new e(openDialog, openBottomSheet);
                g11.n(t13);
            }
            g11.J();
            wk.p.a(aVar2, u11, u12, u13, r7, aVar3, u14, 0L, (ym0.a) t13, g11, 0, 128);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(openDialog, openBottomSheet, i11));
        }
    }

    public final void B3(k1.r0<Boolean> openDialog, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        kotlin.jvm.internal.u.j(openDialog, "openDialog");
        androidx.compose.runtime.b g11 = aVar.g(1962774195);
        g11.s(-2144720701);
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        if ((i12 > 4 && g11.K(openDialog)) || (i11 & 6) == 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object t11 = g11.t();
        if (z5 || t11 == a.C0060a.a()) {
            t11 = new g(openDialog);
            g11.n(t11);
        }
        ym0.a aVar2 = (ym0.a) t11;
        g11.J();
        String u11 = ay.b.u(C1987R.string._DELETE_USER_CONFIRMATION_TITLE_, g11);
        String u12 = ay.b.u(C1987R.string._DELETE_YES_, g11);
        long r7 = ((i1) g11.D(j1.e())).r();
        h hVar = new h(openDialog, this);
        String u13 = ay.b.u(C1987R.string._CANCEL_, g11);
        g11.s(-2144720206);
        if ((i12 <= 4 || !g11.K(openDialog)) && (i11 & 6) != 4) {
            z11 = false;
        }
        Object t12 = g11.t();
        if (z11 || t12 == a.C0060a.a()) {
            t12 = new i(openDialog);
            g11.n(t12);
        }
        g11.J();
        wk.p.a(aVar2, null, u11, u12, r7, hVar, u13, 0L, (ym0.a) t12, g11, 0, 130);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(openDialog, i11));
        }
    }

    public final void C3(k1.r0<Boolean> openDialog, m70.l formState, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        kotlin.jvm.internal.u.j(openDialog, "openDialog");
        kotlin.jvm.internal.u.j(formState, "formState");
        androidx.compose.runtime.b g11 = aVar.g(-668409166);
        g11.s(1976476392);
        if ((((i11 & 14) ^ 6) > 4 && g11.K(openDialog)) || (i11 & 6) == 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object t11 = g11.t();
        if (z5 || t11 == a.C0060a.a()) {
            t11 = new k(openDialog);
            g11.n(t11);
        }
        g11.J();
        wk.p.a((ym0.a) t11, null, ay.b.u(C1987R.string._SAVE_CHANGES_CONFIRMATION_, g11), ay.b.u(C1987R.string._SAVE_, g11), 0L, new l(openDialog, this, formState), ay.b.u(C1987R.string._IGNORE_CHANGES_, g11), 0L, new m(openDialog, this), g11, 0, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(openDialog, formState, i11));
        }
    }

    public final void D3(int i11, androidx.compose.runtime.a aVar, ym0.a onEditPictureClick, boolean z5) {
        androidx.compose.runtime.b bVar;
        kotlin.jvm.internal.u.j(onEditPictureClick, "onEditPictureClick");
        androidx.compose.runtime.b g11 = aVar.g(1276671657);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e g12 = androidx.compose.foundation.layout.x0.g(e1.e(aVar2, 1.0f), yk.h.o(), yk.h.q());
        d.a g13 = b.a.g();
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g13, g11);
        g11.s(-1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(g12);
        nm0.y yVar = null;
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            User user = (User) androidx.compose.runtime.l0.a(L3().c1(), null, null, g11, 2).getValue();
            k1.r0 b11 = androidx.compose.runtime.l0.b(L3().X0(), g11);
            int i12 = r0.h0.f94240a;
            r0.d0.a(r0.s0.a(aVar2, r0.t0.b(g11)), g11);
            g11.s(-733261785);
            if (user != null) {
                com.withings.common.compose.component.c.b(null, user.getNames().getFirst(), user.getNames().getLast(), s70.a.d(user), AvatarSize.f33297b, 0L, 0L, ((Boolean) b11.getValue()).booleanValue(), null, g11, 24576, ConstantsWs.WS_STATUS_DEACTIVATED_DEVUSER);
                yVar = nm0.y.f85009a;
            }
            g11.J();
            g11.s(-733261791);
            if (yVar == null) {
                z3(g11, 8);
            }
            g11.J();
            g11.s(-1989581873);
            if (z5) {
                r0.d0.a(e1.f(aVar2, yk.h.c()), g11);
                String string = getString(C1987R.string.profilePicture_editPicture);
                ButtonSize buttonSize = ButtonSize.f33303e;
                ColorStyle colorStyle = ColorStyle.f33324c;
                l2.b bVar2 = new l2.b(s2.d.a(C1987R.drawable.camera, g11));
                kotlin.jvm.internal.u.g(string);
                bVar = g11;
                com.withings.common.compose.component.l.a(null, string, bVar2, false, colorStyle, buttonSize, false, onEditPictureClick, g11, 221696 | ((i11 << 18) & 29360128), 73);
            } else {
                bVar = g11;
            }
            androidx.compose.runtime.v a13 = com.withings.authentication.mfa.resolve.components.h.a(bVar);
            if (a13 != null) {
                a13.G(new com.withings.wiscale2.user.ui.profile.k(this, z5, onEditPictureClick, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public final void E3(m70.m userProfileInfo, androidx.compose.runtime.a aVar, int i11) {
        b2.f fVar;
        h2.d dVar;
        kotlin.jvm.internal.u.j(userProfileInfo, "userProfileInfo");
        androidx.compose.runtime.b g11 = aVar.g(872993562);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        boolean z5 = !K3();
        Object c11 = androidx.compose.material.o.c(g11, -1275177901, 781107332);
        if (c11 == a.C0060a.a()) {
            c11 = new m70.l(userProfileInfo, z5);
            g11.n(c11);
        }
        m70.l lVar = (m70.l) c11;
        g11.J();
        g11.J();
        g11.s(647597527);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
            g11.n(t12);
        }
        k1.r0 r0Var = (k1.r0) t12;
        g11.J();
        c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, g11, 14);
        k4 k4Var = (k4) g11.D(n1.m());
        g11.s(647597772);
        Object t13 = g11.t();
        if (t13 == a.C0060a.a()) {
            t13 = L3().W0();
            g11.n(t13);
        }
        k1.r0<Boolean> r0Var2 = (k1.r0) t13;
        Object a12 = com.huawei.hms.health.a.a(g11, 647597852);
        if (a12 == a.C0060a.a()) {
            a12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(a12);
        }
        k1.r0<Boolean> r0Var3 = (k1.r0) a12;
        Object a13 = com.huawei.hms.health.a.a(g11, 647597925);
        if (a13 == a.C0060a.a()) {
            a13 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(a13);
        }
        k1.r0<Boolean> r0Var4 = (k1.r0) a13;
        Object a14 = com.huawei.hms.health.a.a(g11, 647598003);
        if (a14 == a.C0060a.a()) {
            a14 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(a14);
        }
        k1.r0<Boolean> r0Var5 = (k1.r0) a14;
        g11.J();
        b2.f fVar2 = (b2.f) g11.D(n1.f());
        g11.s(647598324);
        if (r0Var2.getValue().booleanValue()) {
            C3(r0Var2, lVar, g11, 582);
        }
        g11.J();
        g11.s(647598447);
        if (r0Var3.getValue().booleanValue()) {
            B3(r0Var3, g11, 70);
        }
        g11.J();
        g11.s(647598563);
        if (r0Var4.getValue().booleanValue()) {
            A3(r0Var4, r0Var5, g11, ConstantsWs.WS_STATUS_NABLA_USER_ALREADY_EXISTS);
        }
        g11.J();
        if (r0Var5.getValue().booleanValue()) {
            r0Var5.setValue(Boolean.FALSE);
            r0Var.setValue(BottomSheetType.f33479h);
            if (k4Var != null) {
                k4Var.a();
            }
            fVar = fVar2;
            BuildersKt__Builders_commonKt.launch$default(a11, null, null, new com.withings.wiscale2.user.ui.profile.w(f11, null), 3, null);
        } else {
            fVar = fVar2;
        }
        int i12 = r0.h0.f94240a;
        r0.w d11 = r0.l0.d(r0.l0.c(r0.t0.a(g11), r0.l0.b(0.0f, yk.h.q(), yk.h.r(), 5)), g11);
        h2.d a15 = f1.b.a();
        if (!K3()) {
            dVar = a15;
        } else {
            dVar = null;
        }
        wk.c0.d(a11, this, new o(lVar), null, s1.b.b(g11, 245607133, new p(userProfileInfo, k4Var, a11, r0Var, f11)), com.withings.wiscale2.user.ui.profile.b.f61941a, s1.b.b(g11, -570440097, new q(fVar, lVar, this)), s1.b.b(g11, -978463712, new r(userProfileInfo, this, r0Var3, r0Var4)), userProfileInfo.a(), 0L, f11, s1.b.b(g11, 1101606449, new s(r0Var, this)), s1.b.b(g11, 693582834, new t(a11, f11, lVar, r0Var)), d11, null, dVar, false, s1.b.b(g11, 698521383, new u(lVar, userProfileInfo, this, k4Var, a11, r0Var, f11, fVar)), g11, 14377032, 12583352, 82440);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new v(userProfileInfo, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        L3().d1(i11, i12, intent);
    }

    @Override // com.withings.wiscale2.user.ui.profile.Hilt_EditProfileActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        s0 L3 = L3();
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new com.withings.wiscale2.user.ui.profile.x(L3, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new com.withings.wiscale2.user.ui.profile.y(L3, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new com.withings.wiscale2.user.ui.profile.z(L3, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new com.withings.wiscale2.user.ui.profile.a0(L3, this, null), 3, null);
        e.k.a(this, new s1.a(true, -253089484, new x()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        L3().e1(i11, permissions, grantResults);
    }

    public final void z3(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(1192837426);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e b10 = androidx.compose.foundation.c.b(e1.n(aVar2, 114), ((i1) g11.D(j1.e())).O(), x0.h.e());
            g11.s(733328855);
            androidx.compose.ui.layout.l0 d11 = g6.d(false, g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(b10);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, d11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                n0.z.a(s2.d.a(C1987R.drawable.ic_menu_profile2, g11), "Default user picture", androidx.compose.foundation.layout.m.f4307a.g(androidx.compose.foundation.layout.x0.g(e1.d(aVar2), yk.h.o(), yk.h.q()), b.a.e()), null, null, 0.0f, null, g11, 56, 120);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11));
        }
    }
}
