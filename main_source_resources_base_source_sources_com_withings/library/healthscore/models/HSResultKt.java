package com.withings.library.healthscore.models;

import com.withings.library.healthscore.models.HSResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import ym0.l;
/* compiled from: HSResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001aC\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "R", "Lcom/withings/library/healthscore/models/HSResult;", "Lkotlin/Function1;", AMPExtension.Action.ATTRIBUTE_NAME, "map", "(Lcom/withings/library/healthscore/models/HSResult;Lym0/l;)Lcom/withings/library/healthscore/models/HSResult;", "flatMap", "getOrNull", "(Lcom/withings/library/healthscore/models/HSResult;)Ljava/lang/Object;", "", "isSuccess", "(Lcom/withings/library/healthscore/models/HSResult;)Z", "HealthScore_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HSResultKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> HSResult<R> flatMap(HSResult<? extends T> hSResult, l<? super T, ? extends HSResult<? extends R>> action) {
        u.j(hSResult, "<this>");
        u.j(action, "action");
        if (hSResult instanceof HSResult.Success) {
            return (HSResult) ((HSResult<? extends R>) action.invoke((Object) ((HSResult.Success) hSResult).getValue()));
        }
        if (hSResult instanceof HSResult.Failure) {
            return hSResult;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> T getOrNull(HSResult<? extends T> hSResult) {
        u.j(hSResult, "<this>");
        if (hSResult instanceof HSResult.Success) {
            return (T) ((HSResult.Success) hSResult).getValue();
        }
        if (hSResult instanceof HSResult.Failure) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> boolean isSuccess(HSResult<? extends T> hSResult) {
        u.j(hSResult, "<this>");
        return hSResult instanceof HSResult.Success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> HSResult<R> map(HSResult<? extends T> hSResult, l<? super T, ? extends R> action) {
        u.j(hSResult, "<this>");
        u.j(action, "action");
        if (hSResult instanceof HSResult.Success) {
            return new HSResult.Success(action.invoke((Object) ((HSResult.Success) hSResult).getValue()));
        }
        if (hSResult instanceof HSResult.Failure) {
            return hSResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
