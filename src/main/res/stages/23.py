import json
stage='23'
data={}
data['width']=15
data['height']=15
data['name']='Candy rainbow'
data['hints']={}
data['hints']['horizontal']=['3 3 3 2','3 3 3 1','3 3 4','3 3 5','3 4 4','4 4 3','4 4','5 7','6 6','6 5','7','8','12','1 11','2 9']
data['hints']['vertical']=['9 2','11 1','12','8','7','5 6','6 6','7 5','4 4','3 4 4','4 4 3','5 3 3','4 3 3','1 3 3 3','2 3 3 3']
data['answer']=[]
data['answer'].append([1,1,1,1,1,1,1,1,1,0,0,0,0,1,1])
data['answer'].append([1,1,1,1,1,1,1,1,1,1,1,0,0,0,1])
data['answer'].append([1,1,1,1,1,1,1,1,1,1,1,1,0,0,0])
data['answer'].append([0,0,0,0,0,1,1,1,1,1,1,1,1,0,0])
data['answer'].append([0,0,0,0,0,0,0,1,1,1,1,1,1,1,0])
data['answer'].append([1,1,1,1,1,0,0,0,1,1,1,1,1,1,0])
data['answer'].append([1,1,1,1,1,1,0,0,0,1,1,1,1,1,1])
data['answer'].append([1,1,1,1,1,1,1,0,0,0,1,1,1,1,1])
data['answer'].append([0,0,0,0,1,1,1,1,0,0,0,1,1,1,1])
data['answer'].append([1,1,1,0,0,1,1,1,1,0,0,1,1,1,1])
data['answer'].append([1,1,1,1,0,0,1,1,1,1,0,0,1,1,1])
data['answer'].append([1,1,1,1,1,0,0,1,1,1,0,0,1,1,1])
data['answer'].append([0,0,1,1,1,1,0,1,1,1,0,0,1,1,1])
data['answer'].append([1,0,0,1,1,1,0,1,1,1,0,0,1,1,1])
data['answer'].append([1,1,0,1,1,1,0,1,1,1,0,0,1,1,1])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
