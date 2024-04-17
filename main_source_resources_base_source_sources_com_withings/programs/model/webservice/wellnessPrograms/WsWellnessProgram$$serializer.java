package com.withings.programs.model.webservice.wellnessPrograms;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import okhttp3.internal.http2.Http2;
/* compiled from: WsWellnessProgram.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsWellnessProgram$$serializer implements GeneratedSerializer<WsWellnessProgram> {
    public static final WsWellnessProgram$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsWellnessProgram$$serializer wsWellnessProgram$$serializer = new WsWellnessProgram$$serializer();
        INSTANCE = wsWellnessProgram$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.wellnessPrograms.WsWellnessProgram", wsWellnessProgram$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.PROGRAM_ID, false);
        pluginGeneratedSerialDescriptor.addElement("deployment", false);
        pluginGeneratedSerialDescriptor.addElement("targetType", false);
        pluginGeneratedSerialDescriptor.addElement("targetValue", false);
        pluginGeneratedSerialDescriptor.addElement(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, false);
        pluginGeneratedSerialDescriptor.addElement("modified", false);
        pluginGeneratedSerialDescriptor.addElement("visible", false);
        pluginGeneratedSerialDescriptor.addElement("familyid", false);
        pluginGeneratedSerialDescriptor.addElement("specifics", true);
        pluginGeneratedSerialDescriptor.addElement("durationJson", true);
        pluginGeneratedSerialDescriptor.addElement("eligibility", true);
        pluginGeneratedSerialDescriptor.addElement("countryCodes", true);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        pluginGeneratedSerialDescriptor.addElement("isSuggested", false);
        pluginGeneratedSerialDescriptor.addElement("accessLevel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsWellnessProgram$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = WsWellnessProgram.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(WsSpecifics$$serializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(WsDurationJson$$serializer.INSTANCE);
        KSerializer<?> nullable4 = BuiltinSerializersKt.getNullable(WsEligibility$$serializer.INSTANCE);
        KSerializer<?> nullable5 = BuiltinSerializersKt.getNullable(kSerializerArr[11]);
        KSerializer<?> nullable6 = BuiltinSerializersKt.getNullable(WsData$$serializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, intSerializer, stringSerializer, longSerializer, longSerializer, booleanSerializer, nullable, nullable2, nullable3, nullable4, nullable5, nullable6, booleanSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsWellnessProgram deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        WsSpecifics wsSpecifics;
        Long l5;
        int i12;
        WsData wsData;
        WsEligibility wsEligibility;
        List list;
        WsDurationJson wsDurationJson;
        String str;
        String str2;
        boolean z5;
        int i13;
        boolean z11;
        int i14;
        long j5;
        long j11;
        char c11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = WsWellnessProgram.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 1);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 2);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 4);
            long decodeLongElement2 = beginStructure.decodeLongElement(descriptor2, 5);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 6);
            List list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 11, kSerializerArr[11], null);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 13);
            wsData = (WsData) beginStructure.decodeNullableSerializableElement(descriptor2, 12, WsData$$serializer.INSTANCE, null);
            i11 = decodeIntElement;
            z5 = decodeBooleanElement2;
            str = decodeStringElement;
            i13 = decodeIntElement2;
            wsEligibility = (WsEligibility) beginStructure.decodeNullableSerializableElement(descriptor2, 10, WsEligibility$$serializer.INSTANCE, null);
            wsDurationJson = (WsDurationJson) beginStructure.decodeNullableSerializableElement(descriptor2, 9, WsDurationJson$$serializer.INSTANCE, null);
            l5 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 7, LongSerializer.INSTANCE, null);
            z11 = decodeBooleanElement;
            wsSpecifics = (WsSpecifics) beginStructure.decodeNullableSerializableElement(descriptor2, 8, WsSpecifics$$serializer.INSTANCE, null);
            str2 = decodeStringElement2;
            i14 = beginStructure.decodeIntElement(descriptor2, 14);
            j5 = decodeLongElement;
            i12 = 32767;
            list = list2;
            j11 = decodeLongElement2;
        } else {
            int i15 = 14;
            WsData wsData2 = null;
            WsEligibility wsEligibility2 = null;
            List list3 = null;
            WsDurationJson wsDurationJson2 = null;
            boolean z12 = true;
            int i16 = 0;
            boolean z13 = false;
            int i17 = 0;
            boolean z14 = false;
            int i18 = 0;
            long j12 = 0;
            long j13 = 0;
            WsSpecifics wsSpecifics2 = null;
            String str3 = null;
            String str4 = null;
            int i19 = 0;
            Long l6 = null;
            while (z12) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z12 = false;
                        i15 = 14;
                    case 0:
                        i16 |= 1;
                        i19 = beginStructure.decodeIntElement(descriptor2, 0);
                        i15 = 14;
                    case 1:
                        str3 = beginStructure.decodeStringElement(descriptor2, 1);
                        i16 |= 2;
                        i15 = 14;
                    case 2:
                        i17 = beginStructure.decodeIntElement(descriptor2, 2);
                        i16 |= 4;
                        i15 = 14;
                    case 3:
                        str4 = beginStructure.decodeStringElement(descriptor2, 3);
                        i16 |= 8;
                        i15 = 14;
                    case 4:
                        j12 = beginStructure.decodeLongElement(descriptor2, 4);
                        i16 |= 16;
                        i15 = 14;
                    case 5:
                        j13 = beginStructure.decodeLongElement(descriptor2, 5);
                        i16 |= 32;
                        i15 = 14;
                    case 6:
                        c11 = 7;
                        z14 = beginStructure.decodeBooleanElement(descriptor2, 6);
                        i16 |= 64;
                        i15 = 14;
                    case 7:
                        c11 = 7;
                        l6 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 7, LongSerializer.INSTANCE, l6);
                        i16 |= 128;
                        i15 = 14;
                    case 8:
                        wsSpecifics2 = (WsSpecifics) beginStructure.decodeNullableSerializableElement(descriptor2, 8, WsSpecifics$$serializer.INSTANCE, wsSpecifics2);
                        i16 |= 256;
                        i15 = 14;
                    case 9:
                        wsDurationJson2 = (WsDurationJson) beginStructure.decodeNullableSerializableElement(descriptor2, 9, WsDurationJson$$serializer.INSTANCE, wsDurationJson2);
                        i16 |= 512;
                        i15 = 14;
                    case 10:
                        wsEligibility2 = (WsEligibility) beginStructure.decodeNullableSerializableElement(descriptor2, 10, WsEligibility$$serializer.INSTANCE, wsEligibility2);
                        i16 |= 1024;
                        i15 = 14;
                    case 11:
                        list3 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 11, kSerializerArr[11], list3);
                        i16 |= ModuleCopy.f28574b;
                        i15 = 14;
                    case 12:
                        wsData2 = (WsData) beginStructure.decodeNullableSerializableElement(descriptor2, 12, WsData$$serializer.INSTANCE, wsData2);
                        i16 |= 4096;
                        i15 = 14;
                    case 13:
                        z13 = beginStructure.decodeBooleanElement(descriptor2, 13);
                        i16 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    case 14:
                        i18 = beginStructure.decodeIntElement(descriptor2, i15);
                        i16 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i19;
            wsSpecifics = wsSpecifics2;
            l5 = l6;
            i12 = i16;
            wsData = wsData2;
            wsEligibility = wsEligibility2;
            list = list3;
            wsDurationJson = wsDurationJson2;
            str = str3;
            str2 = str4;
            z5 = z13;
            i13 = i17;
            z11 = z14;
            i14 = i18;
            j5 = j12;
            j11 = j13;
        }
        beginStructure.endStructure(descriptor2);
        return new WsWellnessProgram(i12, i11, str, i13, str2, j5, j11, z11, l5, wsSpecifics, wsDurationJson, wsEligibility, list, wsData, z5, i14, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsWellnessProgram value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsWellnessProgram.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
