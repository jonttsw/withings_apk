package com.withings.wiscale2.food.model;

import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: MealsUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/food/model/MealsUtils;", "", "()V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MealsUtils {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_DISPLAY_IF_NOTHING = " - ";

    /* compiled from: MealsUtils.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\b\"\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ!\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0014J\u001d\u0010\u0016\u001a\n \u0017*\u0004\u0018\u00010\u00040\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withings/wiscale2/food/model/MealsUtils$Companion;", "", "()V", "DEFAULT_DISPLAY_IF_NOTHING", "", "addFloat", "", "floats", "", "([Ljava/lang/Float;)Ljava/lang/Float;", "addFloats", "float1", "float2", "(Ljava/lang/Float;Ljava/lang/Float;)Ljava/lang/Float;", "divideFloat", "value", "quotient", "", "(Ljava/lang/Float;I)Ljava/lang/Float;", "formatInGrams", "(Ljava/lang/Float;)Ljava/lang/String;", "formatInMilliGrams", "getStringValueRounded", "kotlin.jvm.PlatformType", "floatValue", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Float addFloat(Float... floats) {
            u.j(floats, "floats");
            Float f11 = null;
            for (Float f12 : floats) {
                f11 = addFloats(f11, f12);
            }
            return f11;
        }

        public final Float addFloats(Float f11, Float f12) {
            if (f11 == null) {
                return f12;
            }
            if (f12 != null) {
                return Float.valueOf(f12.floatValue() + f11.floatValue());
            }
            return f11;
        }

        public final Float divideFloat(Float f11, int i11) {
            if (f11 != null) {
                return Float.valueOf(f11.floatValue() / i11);
            }
            return null;
        }

        public final String formatInGrams(Float f11) {
            if (f11 == null) {
                return " - ";
            }
            return String.format("%s g", Arrays.copyOf(new Object[]{getStringValueRounded(f11)}, 1));
        }

        public final String formatInMilliGrams(Float f11) {
            if (f11 == null) {
                return " - ";
            }
            return String.format("%s mg", Arrays.copyOf(new Object[]{getStringValueRounded(f11)}, 1));
        }

        public final String getStringValueRounded(Float f11) {
            if (f11 == null) {
                return " - ";
            }
            return NumberFormat.getNumberInstance().format(Math.round(f11.floatValue()));
        }

        private Companion() {
        }
    }
}
