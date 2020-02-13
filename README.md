# ErrorNavigation
After update androidx dependencies from androidx.navigation:navigation-fragment:2.0.0 on 2.2.0 application is crashed after press button "Back". Crash always after return from other fragment to previous fragment containing FragmentPagerAdapter.
This example for getting error IllegalStateException "The specified child already has a parent. You must call removeView() on the child's parent first." after onbackpressed on ViewPager.

# Error fixed. 
See https://stackoverflow.com/questions/60170291/androidx-navigationnavigation-fragment2-2-0-get-you-must-call-removeview-o?answertab=votes#tab-top for decision.
Thank https://stackoverflow.com/users/8353050/alejandro-m

