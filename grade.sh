CPATH=".:../lib/hamcrest-core-1.3.jar:../lib/junit-4.13.2.jar"
f="student-submission/ListExamples.java"


rm -rf student-submission
git clone $1 student-submission
cp TestListExamples.java student-submission/

if [[ -f $f ]] && [[ -e $f ]]
then
    echo "File exists!"
else
    echo "File not found!"
    exit 1
fi

cd student-submission

java -cp $CPATH  org.junit.runner.JUnitCore TestListExamples > failures.txt

if [[ $(grep -c "error: method filter" errors.txt) -ne 0 ]]
then
    echo "ERROR in Filter"
fi

if [[ $(grep -c "error: method merge" errors.txt) -ne 0 ]]
then
    echo "ERROR in Merge"
fi

if [[ $(grep -c "testFilter(TestListExamples)" failures.txt) -ne 0 ]]
then
    echo "FAILED testFilter"
else
    echo "PASSED testFilter"
fi

if [[ $(grep -c "testMerge(TestListExamples)" failures.txt) -ne 0 ]]
then
    echo "FAILED testMerge"
else
    echo "PASSED testMerge"
fi