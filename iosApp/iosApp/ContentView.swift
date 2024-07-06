import SwiftUI
import shared

struct ContentView: View {
    @State private var currentTime: String = SharedKt.formatDateTime(Kotlinx_datetimeLocalDateTime.now())
    private let timer = Timer.publish(every: 1.0, on: .main, in: .common).autoconnect()

    var body: some View {
        Text(currentTime)
            .font(.system(size: 24))
            .onReceive(timer) { input in
                self.currentTime = SharedKt.formatDateTime(Kotlinx_datetimeLocalDateTime.now())
            }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}