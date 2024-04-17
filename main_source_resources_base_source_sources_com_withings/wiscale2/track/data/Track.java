package com.withings.wiscale2.track.data;

import android.os.Parcelable;
import androidx.camera.camera2.internal.v1;
import androidx.compose.material3.d;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.withings.amazon.model.Pathlist;
import com.withings.common.device.s;
import com.withings.features.FeatureFlag;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.workout.workoutdata.DeviceWorkoutData;
import com.withings.workout.workoutdata.StepWorkoutData;
import com.withings.workout.workoutdata.SwimWorkoutData;
import com.withings.workout.workoutdata.WorkoutData;
import ei0.w;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import wr.b;
/* compiled from: Track.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b,\n\u0002\u0018\u0002\n\u0002\ba\b\u0087\b\u0018\u0000 Ý\u00012\u00020\u0001:\u0004Ý\u0001Þ\u0001B\u0083\u0003\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u0010[\u001a\u000200\u0012\b\b\u0002\u0010\\\u001a\u000206\u0012\b\b\u0002\u0010]\u001a\u000206\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010_\u001a\u00020\u0002\u0012\b\b\u0002\u0010`\u001a\u000206\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010b\u001a\u00020\u001b\u0012\b\b\u0002\u0010c\u001a\u00020\u001b\u0012\b\b\u0002\u0010d\u001a\u00020\u001b\u0012\b\b\u0002\u0010e\u001a\u00020\u001b\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010i\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u001b\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010m\u001a\u00020\u0015\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u0010p\u001a\u00020\u0015\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010N\u0012\u0010\b\u0003\u0010r\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010Q\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010Q\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010w\u001a\u00020\u001b¢\u0006\u0006\bÚ\u0001\u0010Û\u0001Bù\u0002\b\u0016\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u0010[\u001a\u000200\u0012\b\b\u0002\u0010\\\u001a\u000206\u0012\b\b\u0002\u0010]\u001a\u000206\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010_\u001a\u00020\u0002\u0012\b\b\u0002\u0010`\u001a\u000206\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010b\u001a\u00020\u001b\u0012\b\b\u0002\u0010c\u001a\u00020\u001b\u0012\b\b\u0002\u0010d\u001a\u00020\u001b\u0012\b\b\u0002\u0010e\u001a\u00020\u001b\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010i\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u001b\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010m\u001a\u00020\u0015\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u0010p\u001a\u00020\u0015\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010N\u0012\u0010\b\u0002\u0010r\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010Q\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010Q\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010w\u001a\u00020\u001b¢\u0006\u0006\bÚ\u0001\u0010Ü\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u0004J\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u001aJ\u0015\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001cJ\r\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0014J\u000f\u0010)\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010\u001eJ\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u0004J\u0015\u0010,\u001a\n +*\u0004\u0018\u00010\u00020\u0002¢\u0006\u0004\b,\u0010\u0004J\r\u0010-\u001a\u00020\u0002¢\u0006\u0004\b-\u0010\u0004J\r\u0010.\u001a\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0012\u00101\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u000200HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u000206HÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010\u0004J\u0010\u0010;\u001a\u000206HÆ\u0003¢\u0006\u0004\b;\u00108J\u0012\u0010<\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b>\u0010\u001eJ\u0010\u0010?\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b?\u0010\u001eJ\u0010\u0010@\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b@\u0010\u001eJ\u0010\u0010A\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bA\u0010\u001eJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010\u0004J\u0012\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bC\u0010=J\u0010\u0010D\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bD\u0010\u0017J\u0012\u0010E\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bE\u0010=J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010\u0004J\u0012\u0010H\u001a\u0004\u0018\u00010GHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bJ\u0010\u0017J\u0012\u0010K\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0004\bK\u00108J\u0012\u0010L\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0004\bL\u00108J\u0010\u0010M\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bM\u0010\u0017J\u0012\u0010O\u001a\u0004\u0018\u00010NHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0018\u0010R\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010QHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u0010\u0004J\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u0010\u0004J\u0018\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010QHÆ\u0003¢\u0006\u0004\bV\u0010SJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010\u0004J\u0010\u0010X\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bX\u0010\u001eJ\u008a\u0003\u0010x\u001a\u00020\u00002\n\b\u0002\u0010Y\u001a\u0004\u0018\u0001002\n\b\u0002\u0010Z\u001a\u0004\u0018\u0001002\b\b\u0002\u0010[\u001a\u0002002\b\b\u0002\u0010\\\u001a\u0002062\b\b\u0002\u0010]\u001a\u0002062\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010_\u001a\u00020\u00022\b\b\u0002\u0010`\u001a\u0002062\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010b\u001a\u00020\u001b2\b\b\u0002\u0010c\u001a\u00020\u001b2\b\b\u0002\u0010d\u001a\u00020\u001b2\b\b\u0002\u0010e\u001a\u00020\u001b2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010i\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u001b2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010l\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010m\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u001b2\n\b\u0002\u0010n\u001a\u0004\u0018\u0001062\n\b\u0002\u0010o\u001a\u0004\u0018\u0001062\b\b\u0002\u0010p\u001a\u00020\u00152\n\b\u0002\u0010q\u001a\u0004\u0018\u00010N2\u0010\b\u0003\u0010r\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010Q2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010Q2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010w\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\bx\u0010yJ\u001a\u0010{\u001a\u00020\u00152\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b{\u0010|J$\u0010\u007f\u001a\u0006\u0012\u0002\b\u00030~2\u0006\u0010}\u001a\u00020\u001b2\u0006\u0010d\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J!\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00022\u000b\u0010\u0081\u0001\u001a\u0006\u0012\u0002\b\u00030~H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0013\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0005\b\u0082\u0001\u0010\u0004J\u0011\u0010\u0084\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0084\u0001\u0010\bJ\u001f\u0010\u0085\u0001\u001a\u00020\u00062\u000b\u0010\u0081\u0001\u001a\u0006\u0012\u0002\b\u00030~H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0005\b\u0087\u0001\u0010\u0004J\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0005\b\u0088\u0001\u0010\bJ\u0012\u0010\u0089\u0001\u001a\u00020\u001bHÂ\u0003¢\u0006\u0005\b\u0089\u0001\u0010\u001eJ\u0012\u0010\u008a\u0001\u001a\u00020\u001bHÂ\u0003¢\u0006\u0005\b\u008a\u0001\u0010\u001eR(\u0010Y\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bY\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u00102\"\u0006\b\u008d\u0001\u0010\u008e\u0001R(\u0010Z\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bZ\u0010\u008b\u0001\u001a\u0005\b\u008f\u0001\u00102\"\u0006\b\u0090\u0001\u0010\u008e\u0001R&\u0010[\u001a\u0002008\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b[\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u00105\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\\\u001a\u0002068\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\\\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u00108\"\u0006\b\u0097\u0001\u0010\u0098\u0001R&\u0010]\u001a\u0002068\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b]\u0010\u0095\u0001\u001a\u0005\b\u0099\u0001\u00108\"\u0006\b\u009a\u0001\u0010\u0098\u0001R\u0019\u0010^\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b^\u0010\u009b\u0001R%\u0010_\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b_\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010\u0004\"\u0005\b\u009d\u0001\u0010\u0014R&\u0010`\u001a\u0002068\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b`\u0010\u0095\u0001\u001a\u0005\b\u009e\u0001\u00108\"\u0006\b\u009f\u0001\u0010\u0098\u0001R(\u0010a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\ba\u0010 \u0001\u001a\u0005\b¡\u0001\u0010=\"\u0006\b¢\u0001\u0010£\u0001R%\u0010b\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bb\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010\u001e\"\u0005\b¦\u0001\u0010\u001cR%\u0010c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bc\u0010¤\u0001\u001a\u0005\b§\u0001\u0010\u001e\"\u0005\b¨\u0001\u0010\u001cR%\u0010d\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bd\u0010¤\u0001\u001a\u0005\b©\u0001\u0010\u001e\"\u0005\bª\u0001\u0010\u001cR%\u0010e\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\be\u0010¤\u0001\u001a\u0005\b«\u0001\u0010\u001e\"\u0005\b¬\u0001\u0010\u001cR\u0019\u0010f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bf\u0010\u00ad\u0001R'\u0010g\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bg\u0010\u009b\u0001\u001a\u0005\b®\u0001\u0010\u0004\"\u0005\b¯\u0001\u0010\u0014R(\u0010h\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bh\u0010 \u0001\u001a\u0005\b°\u0001\u0010=\"\u0006\b±\u0001\u0010£\u0001R$\u0010i\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\bi\u0010²\u0001\u001a\u0004\bi\u0010\u0017\"\u0005\b³\u0001\u0010\u001aR\u0017\u0010\u0018\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010¤\u0001R(\u0010j\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bj\u0010 \u0001\u001a\u0005\b´\u0001\u0010=\"\u0006\bµ\u0001\u0010£\u0001R'\u0010k\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bk\u0010\u009b\u0001\u001a\u0005\b¶\u0001\u0010\u0004\"\u0005\b·\u0001\u0010\u0014R(\u0010l\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bl\u0010¸\u0001\u001a\u0005\b¹\u0001\u0010I\"\u0006\bº\u0001\u0010»\u0001R%\u0010m\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bm\u0010²\u0001\u001a\u0005\b¼\u0001\u0010\u0017\"\u0005\b½\u0001\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b \u0010¤\u0001R(\u0010n\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bn\u0010\u0095\u0001\u001a\u0005\b¾\u0001\u00108\"\u0006\b¿\u0001\u0010\u0098\u0001R(\u0010o\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bo\u0010\u0095\u0001\u001a\u0005\bÀ\u0001\u00108\"\u0006\bÁ\u0001\u0010\u0098\u0001R%\u0010p\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bp\u0010²\u0001\u001a\u0005\bÂ\u0001\u0010\u0017\"\u0005\bÃ\u0001\u0010\u001aR(\u0010q\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bq\u0010Ä\u0001\u001a\u0005\bÅ\u0001\u0010P\"\u0006\bÆ\u0001\u0010Ç\u0001R.\u0010r\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010Q8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\br\u0010È\u0001\u001a\u0005\bÉ\u0001\u0010S\"\u0006\bÊ\u0001\u0010Ë\u0001R'\u0010s\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bs\u0010\u009b\u0001\u001a\u0005\bÌ\u0001\u0010\u0004\"\u0005\bÍ\u0001\u0010\u0014R'\u0010t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bt\u0010\u009b\u0001\u001a\u0005\bÎ\u0001\u0010\u0004\"\u0005\bÏ\u0001\u0010\u0014R.\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bu\u0010È\u0001\u001a\u0005\bÐ\u0001\u0010S\"\u0006\bÑ\u0001\u0010Ë\u0001R'\u0010v\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bv\u0010\u009b\u0001\u001a\u0005\bÒ\u0001\u0010\u0004\"\u0005\bÓ\u0001\u0010\u0014R%\u0010w\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bw\u0010¤\u0001\u001a\u0005\bÔ\u0001\u0010\u001e\"\u0005\bÕ\u0001\u0010\u001cR\u0013\u0010×\u0001\u001a\u0002008F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u00105R\u0013\u0010Ù\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010\u001e¨\u0006ß\u0001"}, d2 = {"Lcom/withings/wiscale2/track/data/Track;", "", "", "durationMinutesSecond", "()Ljava/lang/String;", "getDataJsonString", "Landroid/os/Parcelable;", "getData", "()Landroid/os/Parcelable;", "newData", "setData", "(Landroid/os/Parcelable;)Lcom/withings/wiscale2/track/data/Track;", "getTimeZone", "Lorg/joda/time/DateTimeZone;", "getDateTimeZone", "()Lorg/joda/time/DateTimeZone;", "dateTimeZone", "Lnm0/y;", "setTimeZone", "(Lorg/joda/time/DateTimeZone;)V", "(Ljava/lang/String;)V", "", "isDeleted", "()Z", "deleted", "setDeleted", "(Z)V", "", "(I)V", "getDeleted", "()I", "isInProgress", "inProgress", "setInProgress", "getInProgress", "Lcom/withings/amazon/model/Pathlist;", "pathList", "addPathlist", "(Lcom/withings/amazon/model/Pathlist;)V", "uri", "addUri", "hashCode", "toString", "kotlin.jvm.PlatformType", "getOrGenerateCryptpart", "getPathListsJson", "clone", "()Lcom/withings/wiscale2/track/data/Track;", "", "component1", "()Ljava/lang/Long;", "component2", "component3", "()J", "Lorg/joda/time/DateTime;", "component4", "()Lorg/joda/time/DateTime;", "component5", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "component13", "component15", "component16", "component17", "component19", "component20", "Lcom/withings/wiscale2/track/data/SleepScore;", "component21", "()Lcom/withings/wiscale2/track/data/SleepScore;", "component22", "component24", "component25", "component26", "Lcom/withings/wiscale2/track/data/GpsSummary;", "component27", "()Lcom/withings/wiscale2/track/data/GpsSummary;", "", "component28", "()Ljava/util/List;", "component29", "component30", "component31", "component32", "component33", "id", "wsId", NavigationArguments.USER_ID, "startDate", "endDate", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, FoodDayFragment.ARG_DAY, "modifiedDate", "deviceId", "deviceModel", "deviceType", "attrib", "category", "data", "dataJson", "activityRecognitionVersion", "isSyncedToWs", "deletionReason", ConstantsWs.REDOX_DATA_MODEL_NOTE, "sleepScore", "snoringEnabled", "manualStartDate", "manualEndDate", "blankVasistasFilled", "gpsSummary", "pathlists", "cryptpart", "coverPictureUrl", "uris", "coverPictureUri", "brand", "copy", "(Ljava/lang/Long;Ljava/lang/Long;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;IIIILandroid/os/Parcelable;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Integer;Ljava/lang/String;Lcom/withings/wiscale2/track/data/SleepScore;ZILorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLcom/withings/wiscale2/track/data/GpsSummary;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Lcom/withings/wiscale2/track/data/Track;", "other", "equals", "(Ljava/lang/Object;)Z", "trackType", "Lcom/withings/wiscale2/track/data/Track$Serializer;", "getDataSerializer", "(II)Lcom/withings/wiscale2/track/data/Track$Serializer;", "serializer", "getDataString", "(Lcom/withings/wiscale2/track/data/Track$Serializer;)Ljava/lang/String;", "generateData", "getWorkoutDataFromSerializer", "(Lcom/withings/wiscale2/track/data/Track$Serializer;)Landroid/os/Parcelable;", "component6", "component14", "component18", "component23", "Ljava/lang/Long;", "getId", "setId", "(Ljava/lang/Long;)V", "getWsId", "setWsId", "J", "getUserId", "setUserId", "(J)V", "Lorg/joda/time/DateTime;", "getStartDate", "setStartDate", "(Lorg/joda/time/DateTime;)V", "getEndDate", "setEndDate", "Ljava/lang/String;", "getDay", "setDay", "getModifiedDate", "setModifiedDate", "Ljava/lang/Integer;", "getDeviceId", "setDeviceId", "(Ljava/lang/Integer;)V", "I", "getDeviceModel", "setDeviceModel", "getDeviceType", "setDeviceType", "getAttrib", "setAttrib", "getCategory", "setCategory", "Landroid/os/Parcelable;", "getDataJson", "setDataJson", "getActivityRecognitionVersion", "setActivityRecognitionVersion", "Z", "setSyncedToWs", "getDeletionReason", "setDeletionReason", "getNote", "setNote", "Lcom/withings/wiscale2/track/data/SleepScore;", "getSleepScore", "setSleepScore", "(Lcom/withings/wiscale2/track/data/SleepScore;)V", "getSnoringEnabled", "setSnoringEnabled", "getManualStartDate", "setManualStartDate", "getManualEndDate", "setManualEndDate", "getBlankVasistasFilled", "setBlankVasistasFilled", "Lcom/withings/wiscale2/track/data/GpsSummary;", "getGpsSummary", "setGpsSummary", "(Lcom/withings/wiscale2/track/data/GpsSummary;)V", "Ljava/util/List;", "getPathlists", "setPathlists", "(Ljava/util/List;)V", "getCryptpart", "setCryptpart", "getCoverPictureUrl", "setCoverPictureUrl", "getUris", "setUris", "getCoverPictureUri", "setCoverPictureUri", "getBrand", "setBrand", "getDuration", "duration", "getPauseDurationMillis", "pauseDurationMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;IIIILandroid/os/Parcelable;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Integer;Ljava/lang/String;Lcom/withings/wiscale2/track/data/SleepScore;ZILorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLcom/withings/wiscale2/track/data/GpsSummary;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V", "(Ljava/lang/Long;Ljava/lang/Long;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;IIIILjava/lang/String;Ljava/lang/Integer;ZILjava/lang/Integer;Ljava/lang/String;Lcom/withings/wiscale2/track/data/SleepScore;ZILorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLcom/withings/wiscale2/track/data/GpsSummary;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V", "Companion", "Serializer", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Track {
    public static final String BUCKET = "hm";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    @SerializedName("actirecver")
    private Integer activityRecognitionVersion;
    private int attrib;
    @SerializedName("blank_vasistas_filled")
    private boolean blankVasistasFilled;
    private int brand;
    @SerializedName(WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME)
    private int category;
    private String coverPictureUri;
    @SerializedName("cover_picture")
    private String coverPictureUrl;
    private String cryptpart;
    private Parcelable data;
    private String dataJson;
    @SerializedName("date")
    private String day;
    private int deleted;
    private Integer deletionReason;
    @SerializedName("deviceid")
    private Integer deviceId;
    @SerializedName(WsVasistasSerie.KEY_MODEL)
    private int deviceModel;
    private int deviceType;
    @SerializedName("enddate")
    private DateTime endDate;
    @SerializedName("gps")
    private GpsSummary gpsSummary;
    @SerializedName("localId")

    /* renamed from: id  reason: collision with root package name */
    private Long f61734id;
    @SerializedName("inprogress")
    private int inProgress;
    private boolean isSyncedToWs;
    @SerializedName("manual_enddate")
    private DateTime manualEndDate;
    @SerializedName("manual_startdate")
    private DateTime manualStartDate;
    @SerializedName("modified")
    private DateTime modifiedDate;
    private String note;
    @SerializedName("pictures")
    private List<? extends Pathlist> pathlists;
    @SerializedName("sleep_score")
    private SleepScore sleepScore;
    @SerializedName("snoring_enabled")
    private boolean snoringEnabled;
    @SerializedName("startdate")
    private DateTime startDate;
    @SerializedName("timezone")
    private String timeZone;
    private List<String> uris;
    @SerializedName("userid")
    private long userId;
    @SerializedName("id")
    private Long wsId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Track.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/track/data/Track$Companion;", "", "()V", "BUCKET", "", "DATE_FORMAT", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Track.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/track/data/Track$Serializer;", "T", "Landroid/os/Parcelable;", "", "deserialize", "jsonData", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)Landroid/os/Parcelable;", "serialize", "trackData", "(Landroid/os/Parcelable;)Lcom/google/gson/JsonObject;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface Serializer<T extends Parcelable> {
        T deserialize(JsonObject jsonObject);

        JsonObject serialize(T t11);
    }

    public Track() {
        this(null, null, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, 0, null, null, null, false, 0, null, null, false, null, null, null, null, null, null, 0, -1, 1, null);
    }

    private final Parcelable component14() {
        return this.data;
    }

    private final int component18() {
        return this.deleted;
    }

    private final int component23() {
        return this.inProgress;
    }

    private final String component6() {
        return this.timeZone;
    }

    private final Parcelable generateData() {
        Object a11;
        Serializer<?> dataSerializer = getDataSerializer(this.category, this.attrib);
        if (this.dataJson != null) {
            try {
                JsonElement parse = new JsonParser().parse(this.dataJson);
                u.h(parse, "null cannot be cast to non-null type com.google.gson.JsonObject");
                a11 = dataSerializer.deserialize((JsonObject) parse);
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            if (a11 instanceof k.a) {
                a11 = null;
            }
            Parcelable parcelable = (Parcelable) a11;
            if (parcelable == null) {
                return getWorkoutDataFromSerializer(dataSerializer);
            }
            return parcelable;
        }
        return getWorkoutDataFromSerializer(dataSerializer);
    }

    private final Serializer<?> getDataSerializer(int i11, int i12) {
        if (i12 == 20000) {
            return new DeviceWorkoutDataSerializer();
        }
        if (i11 == 272) {
            return new DeviceWorkoutDataSerializer();
        }
        if (i11 == 7) {
            return new SwimWorkoutDataSerializer();
        }
        if (i11 == 37) {
            return new w();
        }
        return new StepTrackDataSerializer();
    }

    private final String getDataString(Serializer<?> serializer) {
        JsonObject jsonObject;
        if (serializer instanceof DeviceWorkoutDataSerializer) {
            Parcelable data = getData();
            u.h(data, "null cannot be cast to non-null type com.withings.workout.workoutdata.DeviceWorkoutData");
            jsonObject = ((DeviceWorkoutDataSerializer) serializer).serialize((DeviceWorkoutData) data);
        } else if (serializer instanceof SwimWorkoutDataSerializer) {
            Parcelable data2 = getData();
            u.h(data2, "null cannot be cast to non-null type com.withings.workout.workoutdata.SwimWorkoutData");
            jsonObject = ((SwimWorkoutDataSerializer) serializer).serialize((SwimWorkoutData) data2);
        } else if (serializer instanceof w) {
            Parcelable data3 = getData();
            u.h(data3, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            ((w) serializer).getClass();
            jsonObject = w.a((SleepTrackData) data3);
        } else if (serializer instanceof StepTrackDataSerializer) {
            Parcelable data4 = getData();
            u.h(data4, "null cannot be cast to non-null type com.withings.workout.workoutdata.StepWorkoutData");
            jsonObject = ((StepTrackDataSerializer) serializer).serialize((StepWorkoutData) data4);
        } else {
            jsonObject = null;
        }
        return String.valueOf(jsonObject);
    }

    private final Parcelable getWorkoutDataFromSerializer(Serializer<?> serializer) {
        if (serializer instanceof SwimWorkoutDataSerializer) {
            return new SwimWorkoutData();
        }
        if (serializer instanceof w) {
            return new SleepTrackData();
        }
        if (serializer instanceof StepTrackDataSerializer) {
            return new StepWorkoutData();
        }
        return new WorkoutData();
    }

    public final void addPathlist(Pathlist pathList) {
        List<? extends Pathlist> list;
        u.j(pathList, "pathList");
        List<? extends Pathlist> list2 = this.pathlists;
        if (list2 == null) {
            this.pathlists = x.q(pathList);
            return;
        }
        if (list2 != null) {
            list = v1.c0(list2, new Track$addPathlist$1(pathList));
        } else {
            list = null;
        }
        this.pathlists = list;
    }

    public final void addUri(String uri) {
        List<String> list;
        u.j(uri, "uri");
        List<String> list2 = this.uris;
        if (list2 == null) {
            this.uris = x.q(uri);
            return;
        }
        if (list2 != null) {
            list = v1.c0(list2, new Track$addUri$1(uri));
        } else {
            list = null;
        }
        this.uris = list;
    }

    public final Track clone() {
        return new Track(this.f61734id, this.wsId, this.userId, this.startDate, this.endDate, this.timeZone, this.day, this.modifiedDate, this.deviceId, this.deviceModel, this.deviceType, this.attrib, this.category, generateData(), getDataJsonString(), this.activityRecognitionVersion, this.isSyncedToWs, this.deleted, this.deletionReason, this.note, this.sleepScore, this.snoringEnabled, this.inProgress, this.manualStartDate, this.manualEndDate, this.blankVasistasFilled, this.gpsSummary, this.pathlists, this.cryptpart, this.coverPictureUrl, this.uris, this.coverPictureUri, this.brand);
    }

    public final Long component1() {
        return this.f61734id;
    }

    public final int component10() {
        return this.deviceModel;
    }

    public final int component11() {
        return this.deviceType;
    }

    public final int component12() {
        return this.attrib;
    }

    public final int component13() {
        return this.category;
    }

    public final String component15() {
        return this.dataJson;
    }

    public final Integer component16() {
        return this.activityRecognitionVersion;
    }

    public final boolean component17() {
        return this.isSyncedToWs;
    }

    public final Integer component19() {
        return this.deletionReason;
    }

    public final Long component2() {
        return this.wsId;
    }

    public final String component20() {
        return this.note;
    }

    public final SleepScore component21() {
        return this.sleepScore;
    }

    public final boolean component22() {
        return this.snoringEnabled;
    }

    public final DateTime component24() {
        return this.manualStartDate;
    }

    public final DateTime component25() {
        return this.manualEndDate;
    }

    public final boolean component26() {
        return this.blankVasistasFilled;
    }

    public final GpsSummary component27() {
        return this.gpsSummary;
    }

    public final List<Pathlist> component28() {
        return this.pathlists;
    }

    public final String component29() {
        return this.cryptpart;
    }

    public final long component3() {
        return this.userId;
    }

    public final String component30() {
        return this.coverPictureUrl;
    }

    public final List<String> component31() {
        return this.uris;
    }

    public final String component32() {
        return this.coverPictureUri;
    }

    public final int component33() {
        return this.brand;
    }

    public final DateTime component4() {
        return this.startDate;
    }

    public final DateTime component5() {
        return this.endDate;
    }

    public final String component7() {
        return this.day;
    }

    public final DateTime component8() {
        return this.modifiedDate;
    }

    public final Integer component9() {
        return this.deviceId;
    }

    public final Track copy(Long l5, Long l6, long j5, DateTime startDate, DateTime endDate, String str, String day, DateTime modifiedDate, Integer num, int i11, int i12, int i13, int i14, Parcelable parcelable, String str2, Integer num2, boolean z5, int i15, Integer num3, String str3, SleepScore sleepScore, boolean z11, int i16, DateTime dateTime, DateTime dateTime2, boolean z12, GpsSummary gpsSummary, List<? extends Pathlist> list, String str4, String str5, List<String> list2, String str6, int i17) {
        u.j(startDate, "startDate");
        u.j(endDate, "endDate");
        u.j(day, "day");
        u.j(modifiedDate, "modifiedDate");
        return new Track(l5, l6, j5, startDate, endDate, str, day, modifiedDate, num, i11, i12, i13, i14, parcelable, str2, num2, z5, i15, num3, str3, sleepScore, z11, i16, dateTime, dateTime2, z12, gpsSummary, list, str4, str5, list2, str6, i17);
    }

    public final String durationMinutesSecond() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(getDuration()) % 24), Long.valueOf(timeUnit.toMinutes(getDuration()) % 60)}, 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        if (u.e(this.f61734id, track.f61734id) && u.e(this.wsId, track.wsId) && this.userId == track.userId && u.e(this.startDate, track.startDate) && u.e(this.endDate, track.endDate) && u.e(this.timeZone, track.timeZone) && u.e(this.day, track.day) && u.e(this.modifiedDate, track.modifiedDate) && u.e(this.deviceId, track.deviceId) && this.deviceModel == track.deviceModel && this.deviceType == track.deviceType && this.attrib == track.attrib && this.category == track.category && u.e(this.data, track.data) && u.e(this.dataJson, track.dataJson) && u.e(this.activityRecognitionVersion, track.activityRecognitionVersion) && this.isSyncedToWs == track.isSyncedToWs && this.deleted == track.deleted && u.e(this.deletionReason, track.deletionReason) && u.e(this.note, track.note) && u.e(this.sleepScore, track.sleepScore) && this.snoringEnabled == track.snoringEnabled && this.inProgress == track.inProgress && u.e(this.manualStartDate, track.manualStartDate) && u.e(this.manualEndDate, track.manualEndDate) && this.blankVasistasFilled == track.blankVasistasFilled && u.e(this.gpsSummary, track.gpsSummary) && u.e(this.pathlists, track.pathlists) && u.e(this.cryptpart, track.cryptpart) && u.e(this.coverPictureUrl, track.coverPictureUrl) && u.e(this.uris, track.uris) && u.e(this.coverPictureUri, track.coverPictureUri) && this.brand == track.brand) {
            return true;
        }
        return false;
    }

    public final Integer getActivityRecognitionVersion() {
        return this.activityRecognitionVersion;
    }

    public final int getAttrib() {
        return this.attrib;
    }

    public final boolean getBlankVasistasFilled() {
        return this.blankVasistasFilled;
    }

    public final int getBrand() {
        return this.brand;
    }

    public final int getCategory() {
        return this.category;
    }

    public final String getCoverPictureUri() {
        return this.coverPictureUri;
    }

    public final String getCoverPictureUrl() {
        return this.coverPictureUrl;
    }

    public final String getCryptpart() {
        return this.cryptpart;
    }

    public final Parcelable getData() {
        if (this.data == null) {
            this.data = generateData();
        }
        Parcelable parcelable = this.data;
        u.h(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
        return parcelable;
    }

    public final String getDataJson() {
        return this.dataJson;
    }

    public final String getDataJsonString() {
        Object a11;
        String str = null;
        try {
            str = getDataString(getDataSerializer(this.category, this.attrib));
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (k.b(a11) != null) {
            return getDataString();
        }
        return str;
    }

    public final DateTimeZone getDateTimeZone() {
        try {
            DateTimeZone forID = DateTimeZone.forID(this.timeZone);
            u.g(forID);
            return forID;
        } catch (IllegalArgumentException unused) {
            DateTimeZone dateTimeZone = DateTimeZone.getDefault();
            u.g(dateTimeZone);
            return dateTimeZone;
        }
    }

    public final String getDay() {
        return this.day;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    public final Integer getDeletionReason() {
        return this.deletionReason;
    }

    public final Integer getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceModel() {
        return this.deviceModel;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final long getDuration() {
        return (this.endDate.getMillis() - this.startDate.getMillis()) - getPauseDurationMillis();
    }

    public final DateTime getEndDate() {
        return this.endDate;
    }

    public final GpsSummary getGpsSummary() {
        return this.gpsSummary;
    }

    public final Long getId() {
        return this.f61734id;
    }

    public final int getInProgress() {
        return this.inProgress;
    }

    public final DateTime getManualEndDate() {
        return this.manualEndDate;
    }

    public final DateTime getManualStartDate() {
        return this.manualStartDate;
    }

    public final DateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getOrGenerateCryptpart() {
        String str = this.cryptpart;
        if (str == null) {
            String a11 = s.a();
            this.cryptpart = a11;
            return a11;
        }
        return str;
    }

    public final String getPathListsJson() {
        JsonArray jsonArray = new JsonArray();
        List<? extends Pathlist> list = this.pathlists;
        if (list != null) {
            for (Pathlist pathlist : list) {
                jsonArray.add(pathlist.c());
            }
        }
        String jsonElement = jsonArray.toString();
        u.i(jsonElement, "toString(...)");
        return jsonElement;
    }

    public final List<Pathlist> getPathlists() {
        return this.pathlists;
    }

    public final int getPauseDurationMillis() {
        WorkoutData workoutData;
        Parcelable parcelable = this.data;
        int i11 = 0;
        if (!(parcelable instanceof SleepTrackData)) {
            if (parcelable instanceof WorkoutData) {
                workoutData = (WorkoutData) parcelable;
            } else {
                workoutData = null;
            }
            if (workoutData != null) {
                i11 = workoutData.getPauseDuration();
            }
        }
        return i11 * 1000;
    }

    public final SleepScore getSleepScore() {
        return this.sleepScore;
    }

    public final boolean getSnoringEnabled() {
        return this.snoringEnabled;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final List<String> getUris() {
        return this.uris;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        Long l5 = this.f61734id;
        if (l5 != null) {
            return (int) l5.longValue();
        }
        return 0;
    }

    public final boolean isDeleted() {
        if (this.deleted != 0) {
            return true;
        }
        return false;
    }

    public final boolean isInProgress() {
        if (b.c(FeatureFlag.f39116l0) && this.inProgress == 1) {
            return true;
        }
        return false;
    }

    public final boolean isSyncedToWs() {
        return this.isSyncedToWs;
    }

    public final void setActivityRecognitionVersion(Integer num) {
        this.activityRecognitionVersion = num;
    }

    public final void setAttrib(int i11) {
        this.attrib = i11;
    }

    public final void setBlankVasistasFilled(boolean z5) {
        this.blankVasistasFilled = z5;
    }

    public final void setBrand(int i11) {
        this.brand = i11;
    }

    public final void setCategory(int i11) {
        this.category = i11;
    }

    public final void setCoverPictureUri(String str) {
        this.coverPictureUri = str;
    }

    public final void setCoverPictureUrl(String str) {
        this.coverPictureUrl = str;
    }

    public final void setCryptpart(String str) {
        this.cryptpart = str;
    }

    public final Track setData(Parcelable newData) {
        u.j(newData, "newData");
        this.data = newData;
        this.isSyncedToWs = false;
        return this;
    }

    public final void setDataJson(String str) {
        this.dataJson = str;
    }

    public final void setDay(String str) {
        u.j(str, "<set-?>");
        this.day = str;
    }

    public final void setDeleted(boolean z5) {
        this.deleted = z5 ? 1 : 0;
    }

    public final void setDeletionReason(Integer num) {
        this.deletionReason = num;
    }

    public final void setDeviceId(Integer num) {
        this.deviceId = num;
    }

    public final void setDeviceModel(int i11) {
        this.deviceModel = i11;
    }

    public final void setDeviceType(int i11) {
        this.deviceType = i11;
    }

    public final void setEndDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.endDate = dateTime;
    }

    public final void setGpsSummary(GpsSummary gpsSummary) {
        this.gpsSummary = gpsSummary;
    }

    public final void setId(Long l5) {
        this.f61734id = l5;
    }

    public final void setInProgress(boolean z5) {
        this.inProgress = z5 ? 1 : 0;
    }

    public final void setManualEndDate(DateTime dateTime) {
        this.manualEndDate = dateTime;
    }

    public final void setManualStartDate(DateTime dateTime) {
        this.manualStartDate = dateTime;
    }

    public final void setModifiedDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.modifiedDate = dateTime;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final void setPathlists(List<? extends Pathlist> list) {
        this.pathlists = list;
    }

    public final void setSleepScore(SleepScore sleepScore) {
        this.sleepScore = sleepScore;
    }

    public final void setSnoringEnabled(boolean z5) {
        this.snoringEnabled = z5;
    }

    public final void setStartDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.startDate = dateTime;
    }

    public final void setSyncedToWs(boolean z5) {
        this.isSyncedToWs = z5;
    }

    public final void setTimeZone(DateTimeZone dateTimeZone) {
        u.j(dateTimeZone, "dateTimeZone");
        this.timeZone = dateTimeZone.getID();
    }

    public final void setUris(List<String> list) {
        this.uris = list;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    public final void setWsId(Long l5) {
        this.wsId = l5;
    }

    public String toString() {
        String cls = getData().getClass().toString();
        u.i(cls, "toString(...)");
        int i11 = this.category;
        DateTime dateTime = this.startDate;
        DateTime dateTime2 = this.endDate;
        DateTime dateTime3 = this.modifiedDate;
        int i12 = this.attrib;
        int i13 = this.deviceModel;
        int i14 = this.deviceType;
        Integer num = this.deviceId;
        Long l5 = this.f61734id;
        Long l6 = this.wsId;
        boolean z5 = this.isSyncedToWs;
        int i15 = this.deleted;
        String str = this.day;
        Parcelable data = getData();
        int i16 = this.brand;
        StringBuilder a11 = d.a("Track : category ", i11, " (", cls, "), startDate ");
        a11.append(dateTime);
        a11.append(", endDate  ");
        a11.append(dateTime2);
        a11.append(", modifiedDate  ");
        a11.append(dateTime3);
        a11.append(", attrib ");
        a11.append(i12);
        a11.append(", model ");
        v6.b.a(a11, i13, ", deviceType ", i14, ", deviceId ");
        a11.append(num);
        a11.append(", deviceModel ");
        a11.append(i13);
        a11.append(", localId ");
        a11.append(l5);
        a11.append(", wsId ");
        a11.append(l6);
        a11.append(", isSyncedToWs ");
        a11.append(z5);
        a11.append(", deleted ");
        a11.append(i15);
        a11.append(", day ");
        a11.append(str);
        a11.append(", data : ");
        a11.append(data);
        a11.append(", brand : ");
        a11.append(i16);
        return a11.toString();
    }

    public Track(Long l5, Long l6, long j5, DateTime startDate, DateTime endDate, String str, String day, DateTime modifiedDate, Integer num, int i11, int i12, int i13, int i14, Parcelable parcelable, String str2, Integer num2, boolean z5, int i15, Integer num3, String str3, SleepScore sleepScore, boolean z11, int i16, DateTime dateTime, DateTime dateTime2, boolean z12, GpsSummary gpsSummary, List<? extends Pathlist> list, String str4, String str5, List<String> list2, String str6, int i17) {
        u.j(startDate, "startDate");
        u.j(endDate, "endDate");
        u.j(day, "day");
        u.j(modifiedDate, "modifiedDate");
        this.f61734id = l5;
        this.wsId = l6;
        this.userId = j5;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeZone = str;
        this.day = day;
        this.modifiedDate = modifiedDate;
        this.deviceId = num;
        this.deviceModel = i11;
        this.deviceType = i12;
        this.attrib = i13;
        this.category = i14;
        this.data = parcelable;
        this.dataJson = str2;
        this.activityRecognitionVersion = num2;
        this.isSyncedToWs = z5;
        this.deleted = i15;
        this.deletionReason = num3;
        this.note = str3;
        this.sleepScore = sleepScore;
        this.snoringEnabled = z11;
        this.inProgress = i16;
        this.manualStartDate = dateTime;
        this.manualEndDate = dateTime2;
        this.blankVasistasFilled = z12;
        this.gpsSummary = gpsSummary;
        this.pathlists = list;
        this.cryptpart = str4;
        this.coverPictureUrl = str5;
        this.uris = list2;
        this.coverPictureUri = str6;
        this.brand = i17;
    }

    public final void setDeleted(int i11) {
        this.deleted = i11;
    }

    public final void setInProgress(int i11) {
        this.inProgress = i11;
    }

    public final void setTimeZone(String dateTimeZone) {
        u.j(dateTimeZone, "dateTimeZone");
        this.timeZone = dateTimeZone;
    }

    private final String getDataString() {
        JsonObject serialize;
        Parcelable data = getData();
        if (data instanceof DeviceWorkoutData) {
            serialize = new DeviceWorkoutDataSerializer().serialize((DeviceWorkoutData) data);
        } else if (data instanceof SwimWorkoutData) {
            serialize = new SwimWorkoutDataSerializer().serialize((SwimWorkoutData) data);
        } else if (data instanceof SleepTrackData) {
            new w();
            serialize = w.a((SleepTrackData) data);
        } else {
            serialize = data instanceof StepWorkoutData ? new StepTrackDataSerializer().serialize((StepWorkoutData) data) : null;
        }
        return String.valueOf(serialize);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Track(java.lang.Long r36, java.lang.Long r37, long r38, org.joda.time.DateTime r40, org.joda.time.DateTime r41, java.lang.String r42, java.lang.String r43, org.joda.time.DateTime r44, java.lang.Integer r45, int r46, int r47, int r48, int r49, android.os.Parcelable r50, java.lang.String r51, java.lang.Integer r52, boolean r53, int r54, java.lang.Integer r55, java.lang.String r56, com.withings.wiscale2.track.data.SleepScore r57, boolean r58, int r59, org.joda.time.DateTime r60, org.joda.time.DateTime r61, boolean r62, com.withings.wiscale2.track.data.GpsSummary r63, java.util.List r64, java.lang.String r65, java.lang.String r66, java.util.List r67, java.lang.String r68, int r69, int r70, int r71, kotlin.jvm.internal.m r72) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.track.data.Track.<init>(java.lang.Long, java.lang.Long, long, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Integer, int, int, int, int, android.os.Parcelable, java.lang.String, java.lang.Integer, boolean, int, java.lang.Integer, java.lang.String, com.withings.wiscale2.track.data.SleepScore, boolean, int, org.joda.time.DateTime, org.joda.time.DateTime, boolean, com.withings.wiscale2.track.data.GpsSummary, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, int, int, int, kotlin.jvm.internal.m):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Track(java.lang.Long r36, java.lang.Long r37, long r38, org.joda.time.DateTime r40, org.joda.time.DateTime r41, java.lang.String r42, java.lang.String r43, org.joda.time.DateTime r44, java.lang.Integer r45, int r46, int r47, int r48, int r49, java.lang.String r50, java.lang.Integer r51, boolean r52, int r53, java.lang.Integer r54, java.lang.String r55, com.withings.wiscale2.track.data.SleepScore r56, boolean r57, int r58, org.joda.time.DateTime r59, org.joda.time.DateTime r60, boolean r61, com.withings.wiscale2.track.data.GpsSummary r62, java.util.List r63, java.lang.String r64, java.lang.String r65, java.util.List r66, java.lang.String r67, int r68, int r69, kotlin.jvm.internal.m r70) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.track.data.Track.<init>(java.lang.Long, java.lang.Long, long, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, java.lang.String, org.joda.time.DateTime, java.lang.Integer, int, int, int, int, java.lang.String, java.lang.Integer, boolean, int, java.lang.Integer, java.lang.String, com.withings.wiscale2.track.data.SleepScore, boolean, int, org.joda.time.DateTime, org.joda.time.DateTime, boolean, com.withings.wiscale2.track.data.GpsSummary, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, int, int, kotlin.jvm.internal.m):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Track(Long l5, Long l6, long j5, DateTime startDate, DateTime endDate, String str, String day, DateTime modifiedDate, Integer num, int i11, int i12, int i13, int i14, String str2, Integer num2, boolean z5, int i15, Integer num3, String str3, SleepScore sleepScore, boolean z11, int i16, DateTime dateTime, DateTime dateTime2, boolean z12, GpsSummary gpsSummary, List<? extends Pathlist> list, String str4, String str5, List<String> list2, String str6, int i17) {
        this(l5, l6, j5, startDate, endDate, str, day, modifiedDate, num, i11, i12, i13, i14, null, str2, num2, z5, i15, num3, str3, sleepScore, z11, i16, dateTime, dateTime2, z12, gpsSummary, list, str4, str5, list2, str6, i17);
        u.j(startDate, "startDate");
        u.j(endDate, "endDate");
        u.j(day, "day");
        u.j(modifiedDate, "modifiedDate");
    }
}
