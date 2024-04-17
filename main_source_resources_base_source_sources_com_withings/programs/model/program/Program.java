package com.withings.programs.model.program;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.e;
import androidx.camera.core.y1;
import androidx.compose.material.v;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.CurrentWeekAndDayData;
import com.withings.programs.model.CurrentWeekAndDayData$$serializer;
import com.withings.programs.model.programoverview.programoverview.ProgramOverviewEntity;
import com.withings.programs.model.remote.enrolled.EnrolledDto;
import com.withings.programs.model.remote.enrolled.EnrolledDto$$serializer;
import com.withings.programs.model.taskpreview.TaskPreview;
import fn0.d;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import nm0.g;
import nm0.h;
import okhttp3.internal.http2.Http2;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import ym0.a;
/* compiled from: Program.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 R2\u00020\u0001:\u0003RSTB\u0081\u0001\b\u0004\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u000103\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020\n¢\u0006\u0004\bL\u0010MB\u0097\u0001\b\u0017\u0012\u0006\u0010N\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u000103\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\u0006\u0010B\u001a\u00020\n\u0012\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bL\u0010QJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010&\u001a\u00020%8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u001e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0016X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bB\u0010\u0012\u001a\u0004\bC\u0010\u0014R\u0016\u0010F\u001a\u0004\u0018\u00010\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0016\u0010K\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0001\u0002UV¨\u0006W"}, d2 = {"Lcom/withings/programs/model/program/Program;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/programs/model/program/Program;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", ValidateElement.RangeValidateElement.METHOD, "", "retrieveStepProgression", "(Ljava/lang/Integer;)Ljava/lang/Float;", "retrieveComputedDuration", "(Ljava/lang/Integer;)I", NavigationArguments.PROGRAM_ID, "I", "getProgramId", "()I", "", "deployment", "Ljava/lang/String;", "getDeployment", "()Ljava/lang/String;", "targetType", "getTargetType", "targetValue", "getTargetValue", "", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "J", "getCreated", "()J", "modified", "getModified", "", "visible", "Z", "getVisible", "()Z", "familyId", "Ljava/lang/Long;", "getFamilyId", "()Ljava/lang/Long;", "Lcom/withings/programs/model/program/EligibilityDto;", "eligibility", "Lcom/withings/programs/model/program/EligibilityDto;", "getEligibility", "()Lcom/withings/programs/model/program/EligibilityDto;", "", "countryCodes", "Ljava/util/List;", "getCountryCodes", "()Ljava/util/List;", "Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "enrolled", "Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "getEnrolled", "()Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "Lcom/withings/programs/model/CurrentWeekAndDayData;", "currentWeekAndDayData", "Lcom/withings/programs/model/CurrentWeekAndDayData;", "getCurrentWeekAndDayData", "()Lcom/withings/programs/model/CurrentWeekAndDayData;", "accessLevel", "getAccessLevel", "getComputedDuration", "()Ljava/lang/Integer;", "computedDuration", "getProgress", "progress", "getCurrentStepProgression", "()Ljava/lang/Float;", "currentStepProgression", "<init>", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/program/EligibilityDto;Ljava/util/List;Lcom/withings/programs/model/remote/enrolled/EnrolledDto;Lcom/withings/programs/model/CurrentWeekAndDayData;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/program/EligibilityDto;Ljava/util/List;Lcom/withings/programs/model/remote/enrolled/EnrolledDto;Lcom/withings/programs/model/CurrentWeekAndDayData;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "Legacy", "Wifit", "Lcom/withings/programs/model/program/Program$Legacy;", "Lcom/withings/programs/model/program/Program$Wifit;", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public abstract class Program {
    private static final int WEEKS_PER_MONTH = 4;
    @SerializedName("access_level")
    private final int accessLevel;
    @SerializedName("country_codes")
    private final List<String> countryCodes;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private final long created;
    @SerializedName("enrolled")
    private final CurrentWeekAndDayData currentWeekAndDayData;
    @SerializedName("deployment")
    private final String deployment;
    @SerializedName("eligibility")
    private final EligibilityDto eligibility;
    @SerializedName("enrolled")
    private final EnrolledDto enrolled;
    @SerializedName("familyid")
    private final Long familyId;
    @SerializedName("modified")
    private final long modified;
    @SerializedName("programid")
    private final int programId;
    @SerializedName("target_type")
    private final int targetType;
    @SerializedName("target_value")
    private final String targetValue;
    @SerializedName("visible")
    private final boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};
    private static final g<KSerializer<Object>> $cachedSerializer$delegate = h.a(LazyThreadSafetyMode.f76137b, Companion.AnonymousClass1.INSTANCE);

    /* compiled from: Program.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/withings/programs/model/program/Program$Companion;", "", "()V", "WEEKS_PER_MONTH", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/program/Program;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* compiled from: Program.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.withings.programs.model.program.Program$Companion$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass1 extends w implements a<KSerializer<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // ym0.a
            public final KSerializer<Object> invoke() {
                return new SealedClassSerializer("com.withings.programs.model.program.Program", q0.b(Program.class), new d[0], new KSerializer[0], new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Program.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Program> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* compiled from: Program.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0015HÆ\u0003J\t\u0010F\u001a\u00020\u0017HÆ\u0003J\t\u0010G\u001a\u00020\u0019HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\fHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fHÆ\u0003J²\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020\f2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020\u0003HÖ\u0001J\t\u0010W\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u001a\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010&X\u0096\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\r\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001dR\u0018\u00109\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b:\u0010 R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010-R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006X"}, d2 = {"Lcom/withings/programs/model/program/Program$Legacy;", "Lcom/withings/programs/model/program/Program;", NavigationArguments.PROGRAM_ID, "", "deployment", "", "targetType", "targetValue", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "", "modified", "visible", "", "familyId", "durationJson", "Lcom/withings/programs/model/program/DurationJson;", "eligibility", "Lcom/withings/programs/model/program/EligibilityDto;", "countryCodes", "", "enrolled", "Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "currentWeekAndDayData", "Lcom/withings/programs/model/CurrentWeekAndDayData;", "specifics", "Lcom/withings/programs/model/program/Specifics;", "accessLevel", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/program/DurationJson;Lcom/withings/programs/model/program/EligibilityDto;Ljava/util/List;Lcom/withings/programs/model/remote/enrolled/EnrolledDto;Lcom/withings/programs/model/CurrentWeekAndDayData;Lcom/withings/programs/model/program/Specifics;I)V", "getAccessLevel", "()I", "computedDuration", "getComputedDuration", "()Ljava/lang/Integer;", "getCountryCodes", "()Ljava/util/List;", "getCreated", "()J", "currentStepProgression", "", "getCurrentStepProgression", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCurrentWeekAndDayData", "()Lcom/withings/programs/model/CurrentWeekAndDayData;", "getDeployment", "()Ljava/lang/String;", "getDurationJson", "()Lcom/withings/programs/model/program/DurationJson;", "getEligibility", "()Lcom/withings/programs/model/program/EligibilityDto;", "getEnrolled", "()Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "getFamilyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getModified", "getProgramId", "progress", "getProgress", "Ljava/lang/Integer;", "getSpecifics", "()Lcom/withings/programs/model/program/Specifics;", "getTargetType", "getTargetValue", "getVisible", "()Z", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/program/DurationJson;Lcom/withings/programs/model/program/EligibilityDto;Ljava/util/List;Lcom/withings/programs/model/remote/enrolled/EnrolledDto;Lcom/withings/programs/model/CurrentWeekAndDayData;Lcom/withings/programs/model/program/Specifics;I)Lcom/withings/programs/model/program/Program$Legacy;", "equals", "other", "", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Legacy extends Program {
        private final int accessLevel;
        private final int computedDuration;
        private final List<String> countryCodes;
        private final long created;
        private final Float currentStepProgression;
        private final CurrentWeekAndDayData currentWeekAndDayData;
        private final String deployment;
        @SerializedName("duration_json")
        private final DurationJson durationJson;
        private final EligibilityDto eligibility;
        private final EnrolledDto enrolled;
        private final Long familyId;
        private final long modified;
        private final int programId;
        private final Integer progress;
        @SerializedName("specifics")
        private final Specifics specifics;
        private final int targetType;
        private final String targetValue;
        private final boolean visible;

        public /* synthetic */ Legacy(int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, DurationJson durationJson, EligibilityDto eligibilityDto, List list, EnrolledDto enrolledDto, CurrentWeekAndDayData currentWeekAndDayData, Specifics specifics, int i13, int i14, m mVar) {
            this(i11, str, i12, str2, j5, j11, z5, l5, (i14 & 256) != 0 ? null : durationJson, (i14 & 512) != 0 ? null : eligibilityDto, (i14 & 1024) != 0 ? null : list, enrolledDto, currentWeekAndDayData, specifics, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 1 : i13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Legacy copy$default(Legacy legacy, int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, DurationJson durationJson, EligibilityDto eligibilityDto, List list, EnrolledDto enrolledDto, CurrentWeekAndDayData currentWeekAndDayData, Specifics specifics, int i13, int i14, Object obj) {
            int i15;
            String str3;
            int i16;
            String str4;
            long j12;
            long j13;
            boolean z11;
            Long l6;
            DurationJson durationJson2;
            EligibilityDto eligibilityDto2;
            List<String> list2;
            EnrolledDto enrolledDto2;
            CurrentWeekAndDayData currentWeekAndDayData2;
            Specifics specifics2;
            int i17;
            if ((i14 & 1) != 0) {
                i15 = legacy.programId;
            } else {
                i15 = i11;
            }
            if ((i14 & 2) != 0) {
                str3 = legacy.deployment;
            } else {
                str3 = str;
            }
            if ((i14 & 4) != 0) {
                i16 = legacy.targetType;
            } else {
                i16 = i12;
            }
            if ((i14 & 8) != 0) {
                str4 = legacy.targetValue;
            } else {
                str4 = str2;
            }
            if ((i14 & 16) != 0) {
                j12 = legacy.created;
            } else {
                j12 = j5;
            }
            if ((i14 & 32) != 0) {
                j13 = legacy.modified;
            } else {
                j13 = j11;
            }
            if ((i14 & 64) != 0) {
                z11 = legacy.visible;
            } else {
                z11 = z5;
            }
            if ((i14 & 128) != 0) {
                l6 = legacy.familyId;
            } else {
                l6 = l5;
            }
            if ((i14 & 256) != 0) {
                durationJson2 = legacy.durationJson;
            } else {
                durationJson2 = durationJson;
            }
            if ((i14 & 512) != 0) {
                eligibilityDto2 = legacy.eligibility;
            } else {
                eligibilityDto2 = eligibilityDto;
            }
            if ((i14 & 1024) != 0) {
                list2 = legacy.countryCodes;
            } else {
                list2 = list;
            }
            if ((i14 & ModuleCopy.f28574b) != 0) {
                enrolledDto2 = legacy.enrolled;
            } else {
                enrolledDto2 = enrolledDto;
            }
            EnrolledDto enrolledDto3 = enrolledDto2;
            if ((i14 & 4096) != 0) {
                currentWeekAndDayData2 = legacy.currentWeekAndDayData;
            } else {
                currentWeekAndDayData2 = currentWeekAndDayData;
            }
            CurrentWeekAndDayData currentWeekAndDayData3 = currentWeekAndDayData2;
            if ((i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                specifics2 = legacy.specifics;
            } else {
                specifics2 = specifics;
            }
            if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                i17 = legacy.accessLevel;
            } else {
                i17 = i13;
            }
            return legacy.copy(i15, str3, i16, str4, j12, j13, z11, l6, durationJson2, eligibilityDto2, list2, enrolledDto3, currentWeekAndDayData3, specifics2, i17);
        }

        public final int component1() {
            return this.programId;
        }

        public final EligibilityDto component10() {
            return this.eligibility;
        }

        public final List<String> component11() {
            return this.countryCodes;
        }

        public final EnrolledDto component12() {
            return this.enrolled;
        }

        public final CurrentWeekAndDayData component13() {
            return this.currentWeekAndDayData;
        }

        public final Specifics component14() {
            return this.specifics;
        }

        public final int component15() {
            return this.accessLevel;
        }

        public final String component2() {
            return this.deployment;
        }

        public final int component3() {
            return this.targetType;
        }

        public final String component4() {
            return this.targetValue;
        }

        public final long component5() {
            return this.created;
        }

        public final long component6() {
            return this.modified;
        }

        public final boolean component7() {
            return this.visible;
        }

        public final Long component8() {
            return this.familyId;
        }

        public final DurationJson component9() {
            return this.durationJson;
        }

        public final Legacy copy(int i11, String deployment, int i12, String targetValue, long j5, long j11, boolean z5, Long l5, DurationJson durationJson, EligibilityDto eligibilityDto, List<String> list, EnrolledDto enrolled, CurrentWeekAndDayData currentWeekAndDayData, Specifics specifics, int i13) {
            u.j(deployment, "deployment");
            u.j(targetValue, "targetValue");
            u.j(enrolled, "enrolled");
            u.j(currentWeekAndDayData, "currentWeekAndDayData");
            u.j(specifics, "specifics");
            return new Legacy(i11, deployment, i12, targetValue, j5, j11, z5, l5, durationJson, eligibilityDto, list, enrolled, currentWeekAndDayData, specifics, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Legacy)) {
                return false;
            }
            Legacy legacy = (Legacy) obj;
            if (this.programId == legacy.programId && u.e(this.deployment, legacy.deployment) && this.targetType == legacy.targetType && u.e(this.targetValue, legacy.targetValue) && this.created == legacy.created && this.modified == legacy.modified && this.visible == legacy.visible && u.e(this.familyId, legacy.familyId) && u.e(this.durationJson, legacy.durationJson) && u.e(this.eligibility, legacy.eligibility) && u.e(this.countryCodes, legacy.countryCodes) && u.e(this.enrolled, legacy.enrolled) && u.e(this.currentWeekAndDayData, legacy.currentWeekAndDayData) && u.e(this.specifics, legacy.specifics) && this.accessLevel == legacy.accessLevel) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.program.Program
        public int getAccessLevel() {
            return this.accessLevel;
        }

        @Override // com.withings.programs.model.program.Program
        protected Integer getComputedDuration() {
            return Integer.valueOf(this.computedDuration);
        }

        @Override // com.withings.programs.model.program.Program
        public List<String> getCountryCodes() {
            return this.countryCodes;
        }

        @Override // com.withings.programs.model.program.Program
        public long getCreated() {
            return this.created;
        }

        @Override // com.withings.programs.model.program.Program
        public Float getCurrentStepProgression() {
            return this.currentStepProgression;
        }

        @Override // com.withings.programs.model.program.Program
        public CurrentWeekAndDayData getCurrentWeekAndDayData() {
            return this.currentWeekAndDayData;
        }

        @Override // com.withings.programs.model.program.Program
        public String getDeployment() {
            return this.deployment;
        }

        public final DurationJson getDurationJson() {
            return this.durationJson;
        }

        @Override // com.withings.programs.model.program.Program
        public EligibilityDto getEligibility() {
            return this.eligibility;
        }

        @Override // com.withings.programs.model.program.Program
        public EnrolledDto getEnrolled() {
            return this.enrolled;
        }

        @Override // com.withings.programs.model.program.Program
        public Long getFamilyId() {
            return this.familyId;
        }

        @Override // com.withings.programs.model.program.Program
        public long getModified() {
            return this.modified;
        }

        @Override // com.withings.programs.model.program.Program
        public int getProgramId() {
            return this.programId;
        }

        @Override // com.withings.programs.model.program.Program
        public Integer getProgress() {
            return this.progress;
        }

        public final Specifics getSpecifics() {
            return this.specifics;
        }

        @Override // com.withings.programs.model.program.Program
        public int getTargetType() {
            return this.targetType;
        }

        @Override // com.withings.programs.model.program.Program
        public String getTargetValue() {
            return this.targetValue;
        }

        @Override // com.withings.programs.model.program.Program
        public boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int a11 = y1.a(this.visible, c.a(this.modified, c.a(this.created, d.c(this.targetValue, androidx.appcompat.app.h.a(this.targetType, d.c(this.deployment, Integer.hashCode(this.programId) * 31, 31), 31), 31), 31), 31), 31);
            Long l5 = this.familyId;
            int i11 = 0;
            if (l5 == null) {
                hashCode = 0;
            } else {
                hashCode = l5.hashCode();
            }
            int i12 = (a11 + hashCode) * 31;
            DurationJson durationJson = this.durationJson;
            if (durationJson == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = durationJson.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            EligibilityDto eligibilityDto = this.eligibility;
            if (eligibilityDto == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = eligibilityDto.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            List<String> list = this.countryCodes;
            if (list != null) {
                i11 = list.hashCode();
            }
            int hashCode4 = this.enrolled.hashCode();
            int hashCode5 = this.currentWeekAndDayData.hashCode();
            return Integer.hashCode(this.accessLevel) + ((this.specifics.hashCode() + ((hashCode5 + ((hashCode4 + ((i14 + i11) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            int i11 = this.programId;
            String str = this.deployment;
            int i12 = this.targetType;
            String str2 = this.targetValue;
            long j5 = this.created;
            long j11 = this.modified;
            boolean z5 = this.visible;
            Long l5 = this.familyId;
            DurationJson durationJson = this.durationJson;
            EligibilityDto eligibilityDto = this.eligibility;
            List<String> list = this.countryCodes;
            EnrolledDto enrolledDto = this.enrolled;
            CurrentWeekAndDayData currentWeekAndDayData = this.currentWeekAndDayData;
            Specifics specifics = this.specifics;
            int i13 = this.accessLevel;
            StringBuilder a11 = androidx.compose.material3.d.a("Legacy(programId=", i11, ", deployment=", str, ", targetType=");
            v.c(a11, i12, ", targetValue=", str2, ", created=");
            a11.append(j5);
            androidx.work.impl.g.d(a11, ", modified=", j11, ", visible=");
            a11.append(z5);
            a11.append(", familyId=");
            a11.append(l5);
            a11.append(", durationJson=");
            a11.append(durationJson);
            a11.append(", eligibility=");
            a11.append(eligibilityDto);
            a11.append(", countryCodes=");
            a11.append(list);
            a11.append(", enrolled=");
            a11.append(enrolledDto);
            a11.append(", currentWeekAndDayData=");
            a11.append(currentWeekAndDayData);
            a11.append(", specifics=");
            a11.append(specifics);
            a11.append(", accessLevel=");
            return e.c(a11, i13, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Legacy(int i11, String deployment, int i12, String targetValue, long j5, long j11, boolean z5, Long l5, DurationJson durationJson, EligibilityDto eligibilityDto, List<String> list, EnrolledDto enrolled, CurrentWeekAndDayData currentWeekAndDayData, Specifics specifics, int i13) {
            super(i11, deployment, i12, targetValue, j5, j11, z5, l5, eligibilityDto, list, enrolled, currentWeekAndDayData, i13, null);
            u.j(deployment, "deployment");
            u.j(targetValue, "targetValue");
            u.j(enrolled, "enrolled");
            u.j(currentWeekAndDayData, "currentWeekAndDayData");
            u.j(specifics, "specifics");
            this.programId = i11;
            this.deployment = deployment;
            this.targetType = i12;
            this.targetValue = targetValue;
            this.created = j5;
            this.modified = j11;
            this.visible = z5;
            this.familyId = l5;
            this.durationJson = durationJson;
            this.eligibility = eligibilityDto;
            this.countryCodes = list;
            this.enrolled = enrolled;
            this.currentWeekAndDayData = currentWeekAndDayData;
            this.specifics = specifics;
            this.accessLevel = i13;
            this.computedDuration = retrieveComputedDuration(durationJson != null ? Integer.valueOf(durationJson.getRange()) : null);
            Integer computedDuration = getComputedDuration();
            this.progress = computedDuration.intValue() < 0 ? null : computedDuration;
            this.currentStepProgression = retrieveStepProgression(durationJson != null ? Integer.valueOf(durationJson.getRange()) : null);
        }
    }

    /* compiled from: Program.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0011\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0003J\t\u0010G\u001a\u00020\u0013HÆ\u0003J\t\u0010H\u001a\u00020\u0015HÆ\u0003J\t\u0010I\u001a\u00020\u0017HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0011HÆ\u0003J\t\u0010L\u001a\u00020\fHÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\t\u0010S\u001a\u00020\fHÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010U\u001a\u0004\u0018\u00010\u000fHÆ\u0003JÎ\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00112\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\t\u0010[\u001a\u00020\u0003HÖ\u0001J\t\u0010\\\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u001d\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010)X\u0096\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\r\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0011\u0010\u001c\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010:R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010'R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010 R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:¨\u0006]"}, d2 = {"Lcom/withings/programs/model/program/Program$Wifit;", "Lcom/withings/programs/model/program/Program;", NavigationArguments.PROGRAM_ID, "", "deployment", "", "targetType", "targetValue", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "", "modified", "visible", "", "familyId", "eligibility", "Lcom/withings/programs/model/program/EligibilityDto;", "countryCodes", "", "enrolled", "Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "currentWeekAndDayData", "Lcom/withings/programs/model/CurrentWeekAndDayData;", "data", "Lcom/withings/programs/model/program/Data;", "programOverview", "Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;", "tasksPreview", "Lcom/withings/programs/model/taskpreview/TaskPreview;", "isSuggested", "accessLevel", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/program/EligibilityDto;Ljava/util/List;Lcom/withings/programs/model/remote/enrolled/EnrolledDto;Lcom/withings/programs/model/CurrentWeekAndDayData;Lcom/withings/programs/model/program/Data;Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;Ljava/util/List;ZI)V", "getAccessLevel", "()I", "computedDuration", "getComputedDuration", "()Ljava/lang/Integer;", "getCountryCodes", "()Ljava/util/List;", "getCreated", "()J", "currentStepProgression", "", "getCurrentStepProgression", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCurrentWeekAndDayData", "()Lcom/withings/programs/model/CurrentWeekAndDayData;", "getData", "()Lcom/withings/programs/model/program/Data;", "getDeployment", "()Ljava/lang/String;", "getEligibility", "()Lcom/withings/programs/model/program/EligibilityDto;", "getEnrolled", "()Lcom/withings/programs/model/remote/enrolled/EnrolledDto;", "getFamilyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getModified", "getProgramId", "getProgramOverview", "()Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;", "progress", "getProgress", "getTargetType", "getTargetValue", "getTasksPreview", "getVisible", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/program/EligibilityDto;Ljava/util/List;Lcom/withings/programs/model/remote/enrolled/EnrolledDto;Lcom/withings/programs/model/CurrentWeekAndDayData;Lcom/withings/programs/model/program/Data;Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;Ljava/util/List;ZI)Lcom/withings/programs/model/program/Program$Wifit;", "equals", "other", "", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Wifit extends Program {
        private final int accessLevel;
        private final int computedDuration;
        private final List<String> countryCodes;
        private final long created;
        private final Float currentStepProgression;
        private final CurrentWeekAndDayData currentWeekAndDayData;
        @SerializedName("data")
        private final Data data;
        private final String deployment;
        private final EligibilityDto eligibility;
        private final EnrolledDto enrolled;
        private final Long familyId;
        private final boolean isSuggested;
        private final long modified;
        private final int programId;
        @SerializedName("program_overview")
        private final ProgramOverviewEntity programOverview;
        private final int progress;
        private final int targetType;
        private final String targetValue;
        private final List<TaskPreview> tasksPreview;
        private final boolean visible;

        public /* synthetic */ Wifit(int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, EligibilityDto eligibilityDto, List list, EnrolledDto enrolledDto, CurrentWeekAndDayData currentWeekAndDayData, Data data, ProgramOverviewEntity programOverviewEntity, List list2, boolean z11, int i13, int i14, m mVar) {
            this(i11, str, i12, str2, j5, j11, z5, l5, (i14 & 256) != 0 ? null : eligibilityDto, (i14 & 512) != 0 ? null : list, enrolledDto, currentWeekAndDayData, data, programOverviewEntity, list2, z11, i13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Wifit copy$default(Wifit wifit, int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, EligibilityDto eligibilityDto, List list, EnrolledDto enrolledDto, CurrentWeekAndDayData currentWeekAndDayData, Data data, ProgramOverviewEntity programOverviewEntity, List list2, boolean z11, int i13, int i14, Object obj) {
            int i15;
            String str3;
            int i16;
            String str4;
            long j12;
            long j13;
            boolean z12;
            Long l6;
            EligibilityDto eligibilityDto2;
            List<String> list3;
            EnrolledDto enrolledDto2;
            CurrentWeekAndDayData currentWeekAndDayData2;
            Data data2;
            ProgramOverviewEntity programOverviewEntity2;
            List<TaskPreview> list4;
            boolean z13;
            int i17;
            if ((i14 & 1) != 0) {
                i15 = wifit.programId;
            } else {
                i15 = i11;
            }
            if ((i14 & 2) != 0) {
                str3 = wifit.deployment;
            } else {
                str3 = str;
            }
            if ((i14 & 4) != 0) {
                i16 = wifit.targetType;
            } else {
                i16 = i12;
            }
            if ((i14 & 8) != 0) {
                str4 = wifit.targetValue;
            } else {
                str4 = str2;
            }
            if ((i14 & 16) != 0) {
                j12 = wifit.created;
            } else {
                j12 = j5;
            }
            if ((i14 & 32) != 0) {
                j13 = wifit.modified;
            } else {
                j13 = j11;
            }
            if ((i14 & 64) != 0) {
                z12 = wifit.visible;
            } else {
                z12 = z5;
            }
            if ((i14 & 128) != 0) {
                l6 = wifit.familyId;
            } else {
                l6 = l5;
            }
            if ((i14 & 256) != 0) {
                eligibilityDto2 = wifit.eligibility;
            } else {
                eligibilityDto2 = eligibilityDto;
            }
            if ((i14 & 512) != 0) {
                list3 = wifit.countryCodes;
            } else {
                list3 = list;
            }
            if ((i14 & 1024) != 0) {
                enrolledDto2 = wifit.enrolled;
            } else {
                enrolledDto2 = enrolledDto;
            }
            if ((i14 & ModuleCopy.f28574b) != 0) {
                currentWeekAndDayData2 = wifit.currentWeekAndDayData;
            } else {
                currentWeekAndDayData2 = currentWeekAndDayData;
            }
            CurrentWeekAndDayData currentWeekAndDayData3 = currentWeekAndDayData2;
            if ((i14 & 4096) != 0) {
                data2 = wifit.data;
            } else {
                data2 = data;
            }
            Data data3 = data2;
            if ((i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                programOverviewEntity2 = wifit.programOverview;
            } else {
                programOverviewEntity2 = programOverviewEntity;
            }
            ProgramOverviewEntity programOverviewEntity3 = programOverviewEntity2;
            if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                list4 = wifit.tasksPreview;
            } else {
                list4 = list2;
            }
            List<TaskPreview> list5 = list4;
            if ((i14 & Utils.MAX_EVENT_SIZE) != 0) {
                z13 = wifit.isSuggested;
            } else {
                z13 = z11;
            }
            if ((i14 & 65536) != 0) {
                i17 = wifit.accessLevel;
            } else {
                i17 = i13;
            }
            return wifit.copy(i15, str3, i16, str4, j12, j13, z12, l6, eligibilityDto2, list3, enrolledDto2, currentWeekAndDayData3, data3, programOverviewEntity3, list5, z13, i17);
        }

        public final int component1() {
            return this.programId;
        }

        public final List<String> component10() {
            return this.countryCodes;
        }

        public final EnrolledDto component11() {
            return this.enrolled;
        }

        public final CurrentWeekAndDayData component12() {
            return this.currentWeekAndDayData;
        }

        public final Data component13() {
            return this.data;
        }

        public final ProgramOverviewEntity component14() {
            return this.programOverview;
        }

        public final List<TaskPreview> component15() {
            return this.tasksPreview;
        }

        public final boolean component16() {
            return this.isSuggested;
        }

        public final int component17() {
            return this.accessLevel;
        }

        public final String component2() {
            return this.deployment;
        }

        public final int component3() {
            return this.targetType;
        }

        public final String component4() {
            return this.targetValue;
        }

        public final long component5() {
            return this.created;
        }

        public final long component6() {
            return this.modified;
        }

        public final boolean component7() {
            return this.visible;
        }

        public final Long component8() {
            return this.familyId;
        }

        public final EligibilityDto component9() {
            return this.eligibility;
        }

        public final Wifit copy(int i11, String deployment, int i12, String targetValue, long j5, long j11, boolean z5, Long l5, EligibilityDto eligibilityDto, List<String> list, EnrolledDto enrolled, CurrentWeekAndDayData currentWeekAndDayData, Data data, ProgramOverviewEntity programOverviewEntity, List<TaskPreview> list2, boolean z11, int i13) {
            u.j(deployment, "deployment");
            u.j(targetValue, "targetValue");
            u.j(enrolled, "enrolled");
            u.j(currentWeekAndDayData, "currentWeekAndDayData");
            u.j(data, "data");
            return new Wifit(i11, deployment, i12, targetValue, j5, j11, z5, l5, eligibilityDto, list, enrolled, currentWeekAndDayData, data, programOverviewEntity, list2, z11, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Wifit)) {
                return false;
            }
            Wifit wifit = (Wifit) obj;
            if (this.programId == wifit.programId && u.e(this.deployment, wifit.deployment) && this.targetType == wifit.targetType && u.e(this.targetValue, wifit.targetValue) && this.created == wifit.created && this.modified == wifit.modified && this.visible == wifit.visible && u.e(this.familyId, wifit.familyId) && u.e(this.eligibility, wifit.eligibility) && u.e(this.countryCodes, wifit.countryCodes) && u.e(this.enrolled, wifit.enrolled) && u.e(this.currentWeekAndDayData, wifit.currentWeekAndDayData) && u.e(this.data, wifit.data) && u.e(this.programOverview, wifit.programOverview) && u.e(this.tasksPreview, wifit.tasksPreview) && this.isSuggested == wifit.isSuggested && this.accessLevel == wifit.accessLevel) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.program.Program
        public int getAccessLevel() {
            return this.accessLevel;
        }

        @Override // com.withings.programs.model.program.Program
        protected Integer getComputedDuration() {
            return Integer.valueOf(this.computedDuration);
        }

        @Override // com.withings.programs.model.program.Program
        public List<String> getCountryCodes() {
            return this.countryCodes;
        }

        @Override // com.withings.programs.model.program.Program
        public long getCreated() {
            return this.created;
        }

        @Override // com.withings.programs.model.program.Program
        public Float getCurrentStepProgression() {
            return this.currentStepProgression;
        }

        @Override // com.withings.programs.model.program.Program
        public CurrentWeekAndDayData getCurrentWeekAndDayData() {
            return this.currentWeekAndDayData;
        }

        public final Data getData() {
            return this.data;
        }

        @Override // com.withings.programs.model.program.Program
        public String getDeployment() {
            return this.deployment;
        }

        @Override // com.withings.programs.model.program.Program
        public EligibilityDto getEligibility() {
            return this.eligibility;
        }

        @Override // com.withings.programs.model.program.Program
        public EnrolledDto getEnrolled() {
            return this.enrolled;
        }

        @Override // com.withings.programs.model.program.Program
        public Long getFamilyId() {
            return this.familyId;
        }

        @Override // com.withings.programs.model.program.Program
        public long getModified() {
            return this.modified;
        }

        @Override // com.withings.programs.model.program.Program
        public int getProgramId() {
            return this.programId;
        }

        public final ProgramOverviewEntity getProgramOverview() {
            return this.programOverview;
        }

        @Override // com.withings.programs.model.program.Program
        public Integer getProgress() {
            return Integer.valueOf(this.progress);
        }

        @Override // com.withings.programs.model.program.Program
        public int getTargetType() {
            return this.targetType;
        }

        @Override // com.withings.programs.model.program.Program
        public String getTargetValue() {
            return this.targetValue;
        }

        public final List<TaskPreview> getTasksPreview() {
            return this.tasksPreview;
        }

        @Override // com.withings.programs.model.program.Program
        public boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int a11 = y1.a(this.visible, c.a(this.modified, c.a(this.created, d.c(this.targetValue, androidx.appcompat.app.h.a(this.targetType, d.c(this.deployment, Integer.hashCode(this.programId) * 31, 31), 31), 31), 31), 31), 31);
            Long l5 = this.familyId;
            int i11 = 0;
            if (l5 == null) {
                hashCode = 0;
            } else {
                hashCode = l5.hashCode();
            }
            int i12 = (a11 + hashCode) * 31;
            EligibilityDto eligibilityDto = this.eligibility;
            if (eligibilityDto == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = eligibilityDto.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            List<String> list = this.countryCodes;
            if (list == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = list.hashCode();
            }
            int hashCode5 = this.enrolled.hashCode();
            int hashCode6 = (this.data.hashCode() + ((this.currentWeekAndDayData.hashCode() + ((hashCode5 + ((i13 + hashCode3) * 31)) * 31)) * 31)) * 31;
            ProgramOverviewEntity programOverviewEntity = this.programOverview;
            if (programOverviewEntity == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = programOverviewEntity.hashCode();
            }
            int i14 = (hashCode6 + hashCode4) * 31;
            List<TaskPreview> list2 = this.tasksPreview;
            if (list2 != null) {
                i11 = list2.hashCode();
            }
            return Integer.hashCode(this.accessLevel) + y1.a(this.isSuggested, (i14 + i11) * 31, 31);
        }

        public final boolean isSuggested() {
            return this.isSuggested;
        }

        public String toString() {
            int i11 = this.programId;
            String str = this.deployment;
            int i12 = this.targetType;
            String str2 = this.targetValue;
            long j5 = this.created;
            long j11 = this.modified;
            boolean z5 = this.visible;
            Long l5 = this.familyId;
            EligibilityDto eligibilityDto = this.eligibility;
            List<String> list = this.countryCodes;
            EnrolledDto enrolledDto = this.enrolled;
            CurrentWeekAndDayData currentWeekAndDayData = this.currentWeekAndDayData;
            Data data = this.data;
            ProgramOverviewEntity programOverviewEntity = this.programOverview;
            List<TaskPreview> list2 = this.tasksPreview;
            boolean z11 = this.isSuggested;
            int i13 = this.accessLevel;
            StringBuilder a11 = androidx.compose.material3.d.a("Wifit(programId=", i11, ", deployment=", str, ", targetType=");
            v.c(a11, i12, ", targetValue=", str2, ", created=");
            a11.append(j5);
            androidx.work.impl.g.d(a11, ", modified=", j11, ", visible=");
            a11.append(z5);
            a11.append(", familyId=");
            a11.append(l5);
            a11.append(", eligibility=");
            a11.append(eligibilityDto);
            a11.append(", countryCodes=");
            a11.append(list);
            a11.append(", enrolled=");
            a11.append(enrolledDto);
            a11.append(", currentWeekAndDayData=");
            a11.append(currentWeekAndDayData);
            a11.append(", data=");
            a11.append(data);
            a11.append(", programOverview=");
            a11.append(programOverviewEntity);
            a11.append(", tasksPreview=");
            a11.append(list2);
            a11.append(", isSuggested=");
            a11.append(z11);
            a11.append(", accessLevel=");
            return e.c(a11, i13, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wifit(int i11, String deployment, int i12, String targetValue, long j5, long j11, boolean z5, Long l5, EligibilityDto eligibilityDto, List<String> list, EnrolledDto enrolled, CurrentWeekAndDayData currentWeekAndDayData, Data data, ProgramOverviewEntity programOverviewEntity, List<TaskPreview> list2, boolean z11, int i13) {
            super(i11, deployment, i12, targetValue, j5, j11, z5, l5, eligibilityDto, list, enrolled, currentWeekAndDayData, i13, null);
            Float retrieveStepProgression;
            u.j(deployment, "deployment");
            u.j(targetValue, "targetValue");
            u.j(enrolled, "enrolled");
            u.j(currentWeekAndDayData, "currentWeekAndDayData");
            u.j(data, "data");
            this.programId = i11;
            this.deployment = deployment;
            this.targetType = i12;
            this.targetValue = targetValue;
            this.created = j5;
            this.modified = j11;
            this.visible = z5;
            this.familyId = l5;
            this.eligibility = eligibilityDto;
            this.countryCodes = list;
            this.enrolled = enrolled;
            this.currentWeekAndDayData = currentWeekAndDayData;
            this.data = data;
            this.programOverview = programOverviewEntity;
            this.tasksPreview = list2;
            this.isSuggested = z11;
            this.accessLevel = i13;
            this.computedDuration = retrieveComputedDuration(Integer.valueOf(data.getDuration().getRange()));
            this.progress = Math.min(getComputedDuration().intValue(), data.getDuration().getValue());
            if (getComputedDuration().intValue() > getProgress().intValue()) {
                retrieveStepProgression = Float.valueOf(1.0f);
            } else {
                retrieveStepProgression = retrieveStepProgression(Integer.valueOf(data.getDuration().getRange()));
            }
            this.currentStepProgression = retrieveStepProgression;
        }
    }

    public /* synthetic */ Program(int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, EligibilityDto eligibilityDto, List list, EnrolledDto enrolledDto, CurrentWeekAndDayData currentWeekAndDayData, int i13, m mVar) {
        this(i11, str, i12, str2, j5, j11, z5, l5, eligibilityDto, list, enrolledDto, currentWeekAndDayData, i13);
    }

    public static final /* synthetic */ void write$Self(Program program, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, program.getProgramId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, program.getDeployment());
        compositeEncoder.encodeIntElement(serialDescriptor, 2, program.getTargetType());
        compositeEncoder.encodeStringElement(serialDescriptor, 3, program.getTargetValue());
        compositeEncoder.encodeLongElement(serialDescriptor, 4, program.getCreated());
        compositeEncoder.encodeLongElement(serialDescriptor, 5, program.getModified());
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, program.getVisible());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, program.getFamilyId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || program.getEligibility() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, EligibilityDto$$serializer.INSTANCE, program.getEligibility());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || program.getCountryCodes() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], program.getCountryCodes());
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, EnrolledDto$$serializer.INSTANCE, program.getEnrolled());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, CurrentWeekAndDayData$$serializer.INSTANCE, program.getCurrentWeekAndDayData());
        compositeEncoder.encodeIntElement(serialDescriptor, 12, program.getAccessLevel());
    }

    public int getAccessLevel() {
        return this.accessLevel;
    }

    protected abstract Integer getComputedDuration();

    public List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public long getCreated() {
        return this.created;
    }

    public abstract Float getCurrentStepProgression();

    public CurrentWeekAndDayData getCurrentWeekAndDayData() {
        return this.currentWeekAndDayData;
    }

    public String getDeployment() {
        return this.deployment;
    }

    public EligibilityDto getEligibility() {
        return this.eligibility;
    }

    public EnrolledDto getEnrolled() {
        return this.enrolled;
    }

    public Long getFamilyId() {
        return this.familyId;
    }

    public long getModified() {
        return this.modified;
    }

    public int getProgramId() {
        return this.programId;
    }

    public abstract Integer getProgress();

    public int getTargetType() {
        return this.targetType;
    }

    public String getTargetValue() {
        return this.targetValue;
    }

    public boolean getVisible() {
        return this.visible;
    }

    protected final int retrieveComputedDuration(Integer num) {
        if (num != null && num.intValue() == 1) {
            return getCurrentWeekAndDayData().getDayIndex();
        }
        if (num != null && num.intValue() == 2) {
            return getCurrentWeekAndDayData().getWeekIndex() + 1;
        }
        if (num != null && num.intValue() == 3) {
            return getCurrentWeekAndDayData().getWeekIndex() / 4;
        }
        return -1;
    }

    protected final Float retrieveStepProgression(Integer num) {
        if (num != null && num.intValue() == 2) {
            return Float.valueOf(((getCurrentWeekAndDayData().getDayIndex() % 7) + 1) / 7.0f);
        }
        if (num != null && num.intValue() == 3) {
            return Float.valueOf(((getCurrentWeekAndDayData().getWeekIndex() % 4) + 1) / 4.0f);
        }
        return null;
    }

    public /* synthetic */ Program(int i11, int i12, String str, int i13, String str2, long j5, long j11, boolean z5, Long l5, EligibilityDto eligibilityDto, List list, EnrolledDto enrolledDto, CurrentWeekAndDayData currentWeekAndDayData, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        this.programId = i12;
        this.deployment = str;
        this.targetType = i13;
        this.targetValue = str2;
        this.created = j5;
        this.modified = j11;
        this.visible = z5;
        this.familyId = l5;
        if ((i11 & 256) == 0) {
            this.eligibility = null;
        } else {
            this.eligibility = eligibilityDto;
        }
        if ((i11 & 512) == 0) {
            this.countryCodes = null;
        } else {
            this.countryCodes = list;
        }
        this.enrolled = enrolledDto;
        this.currentWeekAndDayData = currentWeekAndDayData;
        this.accessLevel = i14;
    }

    private Program(int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, EligibilityDto eligibilityDto, List<String> list, EnrolledDto enrolledDto, CurrentWeekAndDayData currentWeekAndDayData, int i13) {
        this.programId = i11;
        this.deployment = str;
        this.targetType = i12;
        this.targetValue = str2;
        this.created = j5;
        this.modified = j11;
        this.visible = z5;
        this.familyId = l5;
        this.eligibility = eligibilityDto;
        this.countryCodes = list;
        this.enrolled = enrolledDto;
        this.currentWeekAndDayData = currentWeekAndDayData;
        this.accessLevel = i13;
    }

    public /* synthetic */ Program(int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, EligibilityDto eligibilityDto, List list, EnrolledDto enrolledDto, CurrentWeekAndDayData currentWeekAndDayData, int i13, int i14, m mVar) {
        this(i11, str, i12, str2, j5, j11, z5, l5, (i14 & 256) != 0 ? null : eligibilityDto, (i14 & 512) != 0 ? null : list, enrolledDto, currentWeekAndDayData, i13, null);
    }
}
