package com.company.velogjetpackcomoposenestednavigationgraph

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.company.velogjetpackcomoposenestednavigationgraph.NavRoots.firstNavGraph
import com.company.velogjetpackcomoposenestednavigationgraph.NavRoots.navRoots
import com.company.velogjetpackcomoposenestednavigationgraph.NavRoots.secondNavgraph
import com.company.velogjetpackcomoposenestednavigationgraph.ui.theme.VelogJetpackComoposeNestedNavigationGraphTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VelogJetpackComoposeNestedNavigationGraphTheme {

                Surface(

                ) {
                    NestedNavigation()
                }
            }
        }
    }
}

@Composable
fun NestedNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = navRoots.first.route) {
        firstNavGraph(navController = navController)
        secondNavgraph(navController = navController)
    }
}
















//@Composable
//fun Test()  {
//    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = "login") {
//
//        navigation(
//            startDestination = "login",
//            route = Screen.login.route
//        ) {
//            //  val viewModel = it.sharedViewModel<SampleViewModel>(navControler = navController)를 composable 마다 동일하게 넣어줬으므로
//            //  모든 composable()이 동일한 뷰모델을 공유하게 된다.
//            composable(Screen.login.route) {
//                login(navcontroller = navController)
//            }
//            // 백스택의 NavGraph위에 ?를 표시하면 viewmodel과 해당 상태가 지워진다. 이건 개꿀인데 왜냐하면 백 스택에서 비즈니스를 지울때 탐색 그래프를 지울때 예를 들어 로그인 할 때도 마찬가지야
//            // register기능을 위해서 더 이상 뷰 모델의 공유 상태가 필요하지 않으며
//            composable("login") {
//                val viewModel = it.sharedViewModel<SampleViewModel>(navControler = navController)
//                Button(onClick = {
//                    navController.navigate("calendar") {
//                        popUpTo("auth") {
//                            inclusive = true
//                        }
//                    }
//                }) {
//
//                }
//            }
//            composable("register") {
//                val viewModel = it.sharedViewModel<SampleViewModel>(navControler = navController)
//
//            }
//            composable("forgot_password") {
//                val viewModel = it.sharedViewModel<SampleViewModel>(navControler = navController)
//
//            }
//        }
//        navigation(
//            startDestination = "calendar_overview",
//            route = "calendar"
//        ) {
//            composable("calendar_overview") {
//
//            }
//            composable("calendar_entry") {
//
//            }
//        }
//    }
//}


//// 아래 학장함수는 상위 네비게이션 그래프의 ViewModel을 공유하기 위한 확장함수이다.
//// NavBackStackEntry를 사용하여 현재 composable과 연결된 상위의 네비게이션 그래프의 ViewModel 인스턴스를 가져오는 역할을 한다.
//// 중첩된 NavGraph 내부에서 공유하는 ViewModel에 엑세스할수있는 편리한 확장함수야.
//@Composable
//inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(navControler : NavController) : T { // 제너릭타입T로 설정했기 때문에 모든 유형에서 이 확장함수를 호출 할 수 있다.
//    val navGraphRoute = destination.parent?.route ?: return viewModel() // 상위 NavGraph의 Route 찾기
//    // navGraph의 상위 항목을 참조하기 위해서
//
//
//
//
//    ////////////////////////////////////////////////////////////////////////////////////////////////
//    val parentEntry = remember(this) { // 상위 NavGraph의 NavBackStackEntry  찾기
//        navControler.getBackStackEntry(navGraphRoute) // NavBackStackEntry가 변경될 때 위의 확장함수를 호출할 때마다 navController에서 상위항목을 가져오고 싶기 때문에
//        //  가져오려는 경로를 전달해야 한느 항목을 가져온다.
//    }
//    return viewModel(parentEntry) // parentEntry와 연결된 ViewModel 인스턴스를 반환함으로서 상위 NavGrap와 연결된 ViewModel을 현재 composable()에서 사용 할 수 있게 한다.
//}
//




















