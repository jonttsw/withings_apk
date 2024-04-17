package com.withings.wiscale2.spo2;

import android.content.Context;
import android.content.res.Resources;
import android.health.connect.HealthConnectException;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.u0;
import com.google.android.material.textview.MaterialTextView;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.f0;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import nn0.e0;
import nn0.h0;
import nn0.s0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
/* compiled from: SpO2MeasuresListActivity_MembersInjector.java */
/* loaded from: classes5.dex */
public final class m implements ak0.b {
    public static final String a(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final Charset b(el0.i iVar) {
        kotlin.jvm.internal.u.j(iVar, "<this>");
        String c11 = iVar.c("charset");
        if (c11 == null) {
            return null;
        }
        try {
            return Charset.forName(c11);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final Object c(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        Class s11;
        if ((callableMemberDescriptor instanceof e0) && io0.e.d((s0) callableMemberDescriptor)) {
            return obj;
        }
        f0 f11 = f(callableMemberDescriptor);
        if (f11 != null && (s11 = s(f11)) != null) {
            return i(s11, callableMemberDescriptor).invoke(obj, new Object[0]);
        }
        return obj;
    }

    public static final kotlin.reflect.jvm.internal.calls.a d(kotlin.reflect.jvm.internal.calls.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.e descriptor, boolean z5) {
        f0 f11;
        kotlin.jvm.internal.u.j(descriptor, "descriptor");
        if (!io0.e.a(descriptor)) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.h> e11 = descriptor.e();
            kotlin.jvm.internal.u.i(e11, "descriptor.valueParameters");
            List<kotlin.reflect.jvm.internal.impl.descriptors.h> list = e11;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : list) {
                    f0 type = hVar.getType();
                    kotlin.jvm.internal.u.i(type, "it.type");
                    if (io0.e.c(type)) {
                        break;
                    }
                }
            }
            f0 returnType = descriptor.getReturnType();
            if ((returnType == null || !io0.e.c(returnType)) && ((aVar instanceof jn0.d) || (f11 = f(descriptor)) == null || !io0.e.c(f11))) {
                return aVar;
            }
        }
        return new kotlin.reflect.jvm.internal.calls.c(aVar, descriptor, z5);
    }

    public static final View e(LinearLayout linearLayout, LayoutInflater layoutInflater, int i11, int i12) {
        View inflate = layoutInflater.inflate(C1987R.layout.view_activation_bullets, (ViewGroup) linearLayout, false);
        ((MaterialTextView) inflate.findViewById(C1987R.id.bullet)).setText(String.valueOf(i11 + 1));
        ((MaterialTextView) inflate.findViewById(C1987R.id.text)).setText(i12);
        int dimensionPixelSize = inflate.getResources().getDimensionPixelSize(C1987R.dimen.keyline_0);
        inflate.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        return inflate;
    }

    private static final f0 f(CallableMemberDescriptor callableMemberDescriptor) {
        nn0.b bVar;
        h0 H = callableMemberDescriptor.H();
        h0 E = callableMemberDescriptor.E();
        if (H != null) {
            return H.getType();
        }
        if (E != null) {
            if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
                return E.getType();
            }
            nn0.f d11 = callableMemberDescriptor.d();
            if (d11 instanceof nn0.b) {
                bVar = (nn0.b) d11;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                return bVar.l();
            }
        }
        return null;
    }

    public static final long g(DateTime dateTime) {
        kotlin.jvm.internal.u.j(dateTime, "<this>");
        return dateTime.getMillis() / 1000;
    }

    public static final String h(View view, int i11) {
        kotlin.jvm.internal.u.j(view, "<this>");
        String string = view.getContext().getString(i11);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return string;
    }

    public static final Method i(Class cls, CallableMemberDescriptor descriptor) {
        kotlin.jvm.internal.u.j(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            kotlin.jvm.internal.u.i(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final boolean j(Device device) {
        kotlin.jvm.internal.u.j(device, "<this>");
        int network = device.getNetwork();
        if (network == 1 || network == 3 || network == 4) {
            return true;
        }
        return false;
    }

    public static void k(boolean z5) {
        if (z5) {
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    public static void l(String str) {
        if (str != null && str.length() != 0) {
            return;
        }
        throw new IllegalArgumentException("String must not be empty");
    }

    public static void m(String str, String str2) {
        if (str != null && str.length() != 0) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void n(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static final Resources p(androidx.compose.runtime.a aVar) {
        aVar.D(u0.c());
        return ((Context) aVar.D(u0.d())).getResources();
    }

    public static final ht.a q(pt.d dVar) {
        Double d11;
        Double d12;
        Double d13;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        Double d18;
        Double d19;
        Double d21;
        Double d22;
        Double d23;
        Double d24;
        Double d25;
        Double d26;
        Double d27;
        Double d28;
        Double d29;
        Double d31;
        Double d32;
        kotlin.jvm.internal.u.j(dVar, "<this>");
        String r7 = r(dVar.e());
        long k11 = dVar.k();
        long millis = dVar.h().getMillis();
        double f11 = dVar.f();
        pt.b b10 = dVar.b();
        if (b10 != null) {
            d11 = Double.valueOf(b10.b());
        } else {
            d11 = null;
        }
        pt.b b11 = dVar.b();
        if (b11 != null) {
            d12 = b11.a();
        } else {
            d12 = null;
        }
        pt.b b12 = dVar.b();
        if (b12 != null) {
            d13 = b12.c();
        } else {
            d13 = null;
        }
        pt.c d33 = dVar.d();
        if (d33 != null) {
            d14 = Double.valueOf(d33.c());
        } else {
            d14 = null;
        }
        pt.c d34 = dVar.d();
        if (d34 != null) {
            d15 = d34.b();
        } else {
            d15 = null;
        }
        pt.c d35 = dVar.d();
        if (d35 != null) {
            d16 = d35.d();
        } else {
            d16 = null;
        }
        pt.c d36 = dVar.d();
        if (d36 != null) {
            d17 = d36.a();
        } else {
            d17 = null;
        }
        pt.f g11 = dVar.g();
        if (g11 != null) {
            d18 = Double.valueOf(g11.h());
        } else {
            d18 = null;
        }
        pt.f g12 = dVar.g();
        if (g12 != null) {
            d19 = g12.f();
        } else {
            d19 = null;
        }
        pt.f g13 = dVar.g();
        if (g13 != null) {
            d21 = g13.i();
        } else {
            d21 = null;
        }
        pt.f g14 = dVar.g();
        if (g14 != null) {
            d22 = g14.g();
        } else {
            d22 = null;
        }
        pt.f g15 = dVar.g();
        if (g15 != null) {
            d23 = g15.c();
        } else {
            d23 = null;
        }
        pt.f g16 = dVar.g();
        if (g16 != null) {
            d24 = g16.b();
        } else {
            d24 = null;
        }
        pt.f g17 = dVar.g();
        if (g17 != null) {
            d25 = g17.d();
        } else {
            d25 = null;
        }
        pt.f g18 = dVar.g();
        if (g18 != null) {
            d26 = g18.e();
        } else {
            d26 = null;
        }
        pt.f g19 = dVar.g();
        if (g19 != null) {
            d27 = g19.a();
        } else {
            d27 = null;
        }
        pt.g i11 = dVar.i();
        if (i11 != null) {
            d28 = Double.valueOf(i11.a());
        } else {
            d28 = null;
        }
        pt.g i12 = dVar.i();
        if (i12 != null) {
            d29 = i12.b();
        } else {
            d29 = null;
        }
        pt.g i13 = dVar.i();
        if (i13 != null) {
            d31 = i13.d();
        } else {
            d31 = null;
        }
        pt.g i14 = dVar.i();
        if (i14 != null) {
            d32 = i14.c();
        } else {
            d32 = null;
        }
        return new ht.a(r7, k11, millis, f11, d11, d12, d13, d14, d15, d16, d17, d18, d19, d21, d22, d23, d24, d25, d26, d27, d28, d29, d31, d32, dVar.c(), dVar.j(), dVar.l());
    }

    public static final String r(LocalDate localDate) {
        kotlin.jvm.internal.u.j(localDate, "<this>");
        String print = DateTimeFormat.forPattern("yyyy/MM/dd").print(localDate);
        kotlin.jvm.internal.u.i(print, "print(...)");
        return print;
    }

    public static final Class s(f0 f0Var) {
        kotlin.jvm.internal.u.j(f0Var, "<this>");
        Class t11 = t(f0Var.H0().j());
        if (t11 == null) {
            return null;
        }
        if (!q1.h(f0Var)) {
            return t11;
        }
        n0 f11 = io0.e.f(f0Var);
        if (f11 == null || q1.h(f11) || ln0.j.j0(f11)) {
            return null;
        }
        return t11;
    }

    public static final Class t(nn0.f fVar) {
        if ((fVar instanceof nn0.b) && io0.e.b(fVar)) {
            nn0.b bVar = (nn0.b) fVar;
            Class<?> k11 = in0.m.k(bVar);
            if (k11 == null) {
                throw new KotlinReflectionInternalError("Class object for the class " + bVar.getName() + " cannot be found (classId=" + lo0.c.f((nn0.d) fVar) + ')');
            }
            return k11;
        }
        return null;
    }

    public static final Exception u(HealthConnectException healthConnectException) {
        int errorCode;
        String message;
        errorCode = healthConnectException.getErrorCode();
        if (errorCode != 3) {
            if (errorCode != 4) {
                if (errorCode != 5) {
                    if (errorCode == 6) {
                        message = healthConnectException.getMessage();
                        return new RemoteException(message);
                    }
                    return new IllegalStateException(healthConnectException);
                }
                return new SecurityException(healthConnectException);
            }
            return new IOException(healthConnectException);
        }
        return new IllegalArgumentException(healthConnectException);
    }

    public static final pt.d v(ht.a aVar) {
        pt.b bVar;
        pt.c cVar;
        pt.f fVar;
        kotlin.jvm.internal.u.j(aVar, "<this>");
        long x11 = aVar.x();
        String k11 = aVar.k();
        kotlin.jvm.internal.u.j(k11, "<this>");
        LocalDate parseLocalDate = DateTimeFormat.forPattern("yyyy/MM/dd").parseLocalDate(k11);
        kotlin.jvm.internal.u.i(parseLocalDate, "parseLocalDate(...)");
        DateTime dateTime = new DateTime(aVar.p());
        double n11 = aVar.n();
        Double b10 = aVar.b();
        pt.g gVar = null;
        if (b10 != null) {
            bVar = new pt.b(b10.doubleValue(), aVar.a(), aVar.v());
        } else {
            bVar = null;
        }
        Double i11 = aVar.i();
        if (i11 != null) {
            cVar = new pt.c(i11.doubleValue(), aVar.h(), aVar.A(), aVar.g());
        } else {
            cVar = null;
        }
        Double o11 = aVar.o();
        if (o11 != null) {
            fVar = new pt.f(o11.doubleValue(), aVar.m(), aVar.z(), aVar.q(), aVar.f(), aVar.e(), aVar.j(), aVar.l(), aVar.c());
        } else {
            fVar = null;
        }
        Double u11 = aVar.u();
        if (u11 != null) {
            gVar = new pt.g(u11.doubleValue(), aVar.r(), aVar.t(), aVar.s());
        }
        return new pt.d(x11, parseLocalDate, dateTime, n11, bVar, cVar, fVar, gVar, aVar.d(), aVar.w(), aVar.y());
    }

    public static void w(int i11, String str) {
        if (i11 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i11);
    }
}
