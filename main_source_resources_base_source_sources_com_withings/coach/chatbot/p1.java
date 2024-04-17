package com.withings.coach.chatbot;

import android.content.Context;
import com.withings.insight.android.entity.InputMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: UserResponseFormatController.kt */
/* loaded from: classes3.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f33095a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f33096b;

    /* compiled from: UserResponseFormatController.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);

        void onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserResponseFormatController.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<String, u0> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final u0 invoke(String str) {
            String it = str;
            kotlin.jvm.internal.u.j(it, "it");
            return ah.l.c(p1.this.b(), it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserResponseFormatController.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<u0, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33098a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f33098a = str;
        }

        @Override // ym0.l
        public final Boolean invoke(u0 u0Var) {
            u0 it = u0Var;
            kotlin.jvm.internal.u.j(it, "it");
            return Boolean.valueOf(it.b(this.f33098a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserResponseFormatController.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<u0, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f33099a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final String invoke(u0 u0Var) {
            u0 it = u0Var;
            kotlin.jvm.internal.u.j(it, "it");
            return it.a();
        }
    }

    public p1(a aVar, Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f33095a = aVar;
        this.f33096b = context;
    }

    public final void a(String inputValue, InputMetadata inputMetadata) {
        kotlin.jvm.internal.u.j(inputValue, "inputValue");
        String control = inputMetadata.getControl();
        a aVar = this.f33095a;
        if (control != null) {
            nm0.y yVar = null;
            if (control.length() <= 0) {
                control = null;
            }
            if (control != null) {
                List A = cp0.n.A(cp0.n.t(cp0.n.i(cp0.n.u(kotlin.collections.x.t(dp0.j.o(control, new String[]{" "})), new b()), new c(inputValue)), d.f33099a));
                if (!(!A.isEmpty())) {
                    A = null;
                }
                if (A != null) {
                    if (aVar != null) {
                        aVar.a(kotlin.collections.x.R(A, " , ", null, null, null, 62));
                        yVar = nm0.y.f85009a;
                    }
                    if (yVar != null) {
                        return;
                    }
                }
            }
        }
        if (aVar != null) {
            aVar.onSuccess();
        }
    }

    public final Context b() {
        return this.f33096b;
    }

    public final l1 c(InputMetadata inputMetadata) {
        Object obj;
        String control = inputMetadata.getControl();
        if (control == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : dp0.j.o(control, new String[]{" "})) {
            u0 c11 = ah.l.c(this.f33096b, str);
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.u.e(((u0) obj).getClass(), l1.class)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        u0 u0Var = (u0) obj;
        if (u0Var == null) {
            return null;
        }
        return (l1) u0Var;
    }
}
