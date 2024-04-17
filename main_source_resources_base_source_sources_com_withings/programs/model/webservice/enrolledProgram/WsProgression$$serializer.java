package com.withings.programs.model.webservice.enrolledProgram;

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
/* compiled from: WsProgression.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/enrolledProgram/WsProgression.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsProgression$$serializer implements GeneratedSerializer<WsProgression> {
    public static final WsProgression$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsProgression$$serializer wsProgression$$serializer = new WsProgression$$serializer();
        INSTANCE = wsProgression$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.enrolledProgram.WsProgression", wsProgression$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("start", false);
        pluginGeneratedSerialDescriptor.addElement("end", false);
        pluginGeneratedSerialDescriptor.addElement("menu", true);
        pluginGeneratedSerialDescriptor.addElement("summary", true);
        pluginGeneratedSerialDescriptor.addElement("fullSummary", true);
        pluginGeneratedSerialDescriptor.addElement("progress", true);
        pluginGeneratedSerialDescriptor.addElement("unread", true);
        pluginGeneratedSerialDescriptor.addElement("programSwToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsProgression$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = WsProgression.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[3]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, longSerializer, nullable, nullable2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsProgression deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        String str;
        Boolean bool;
        Integer num;
        String str2;
        String str3;
        List list;
        Long l5;
        int i12;
        long j5;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = WsProgression.$childSerializers;
        int i13 = 8;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            list = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            i11 = decodeIntElement;
            bool = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, null);
            num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, null);
            str3 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            l5 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, null);
            i12 = 511;
            j5 = decodeLongElement;
        } else {
            long j11 = 0;
            boolean z5 = true;
            int i14 = 0;
            String str4 = null;
            Boolean bool2 = null;
            Integer num2 = null;
            String str5 = null;
            String str6 = null;
            List list2 = null;
            Long l6 = null;
            int i15 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        i14 = beginStructure.decodeIntElement(descriptor2, 0);
                        break;
                    case 1:
                        j11 = beginStructure.decodeLongElement(descriptor2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        l6 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, l6);
                        i15 |= 4;
                        break;
                    case 3:
                        list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], list2);
                        i15 |= 8;
                        break;
                    case 4:
                        str5 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str5);
                        i15 |= 16;
                        break;
                    case 5:
                        str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str6);
                        i15 |= 32;
                        break;
                    case 6:
                        num2 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, num2);
                        i15 |= 64;
                        break;
                    case 7:
                        bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, bool2);
                        i15 |= 128;
                        break;
                    case 8:
                        str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i13, StringSerializer.INSTANCE, str4);
                        i15 |= 256;
                        continue;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
                i13 = 8;
            }
            i11 = i14;
            str = str4;
            bool = bool2;
            num = num2;
            str2 = str5;
            str3 = str6;
            list = list2;
            l5 = l6;
            i12 = i15;
            j5 = j11;
        }
        beginStructure.endStructure(descriptor2);
        return new WsProgression(i12, i11, j5, l5, list, str2, str3, num, bool, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsProgression value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsProgression.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
